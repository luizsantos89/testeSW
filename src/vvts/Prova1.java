
package vvts;

public class Prova1 {
    private double salario;
    
    public double calculaSeguroDesemprego() {
        double valorParcela = 0;
        if(salario<=1360.7)
            valorParcela = salario*0.80;
        else if(salario<=2268.05)
            valorParcela = ((salario-1360.7)*0.50)+1088.56;
        else
            valorParcela = 1542.24;
        return valorParcela;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
