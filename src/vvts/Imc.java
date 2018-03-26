
package vvts;

public class Imc {
    private String sexo;
    private double peso;
    private double altura;
    private double imc;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
   
    public String calculaImc(){
        String resultado = null;
        
        imc = peso/(altura*altura);
        
        if(sexo.equals("feminino")) {
            if(imc<19.1)
                resultado = "Abaixo do peso";
            else if(imc < 25.8)
                resultado = "Peso normal";
            else if(imc < 27.3)
                resultado = "Marginalmente acima do peso";
            else if(imc < 32.3)
                resultado = "Acima do peso";
            else resultado = "Obeso";
        } else {
            if(imc < 20.7)
                resultado = "Abaixo do peso";
            else if(imc < 26.4)
                resultado = "Peso normal";
            else if(imc < 27.8)
                resultado = "Marginalmente acima do peso";
            else if(imc < 31.1)
                resultado = "Acima do peso";
            else resultado = "Obeso";
        }
        
        return resultado;
    }
}
