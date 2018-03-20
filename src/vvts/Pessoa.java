/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvts;

/**
 *
 * @author fjf739
 */
public class Pessoa {
    private Double peso;
    private Double altura;
    private Double imc;
    private String sexo;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String calculaIMC() {
        String resultado;
        imc = peso/(altura*altura);
        
        if (sexo.equals("feminino")){ //1
            if(imc < 19.1) //2
                resultado = "Abaixo do peso"; //3  
            else if(imc < 25.8) //4
                resultado = "Peso normal"; //5
            else if(imc < 27.3) //6
                resultado = "Marginalmente acima do peso";//7
            else if(imc < 32.3) //8
                resultado = "Acima do peso";//9
            else 
                resultado = "Obeso";//10
        } else {       
            if(imc < 20.7)//11
                resultado = "Abaixo do peso";//12
            else if(imc < 26.4)//13
                resultado = "Peso normal";//14
            else if(imc < 27.8)//15
                resultado = "Marginalmente acima do peso";//16
            else if(imc < 31.1)//17
                resultado = "Acima do peso";//18
            else 
                resultado = "Obeso";//19
        }
        
        return resultado;
    }    
}
