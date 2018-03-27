
package vvts;

public class CalculosTrabalhistas {
    private double salarioBruto;
    private double salarioLiquido;
    private boolean valeTransporte;
    private boolean valeAlimentacao;
    private double valorHorasExtras;
    private int numeroHorasExtras;
    
    public double calculaSalarioLiquido(){
        
        if(salarioBruto < 1399.12)
            salarioLiquido = salarioBruto-(salarioBruto*0.08);
            if(valeTransporte) {
                salarioLiquido = salarioBruto-(salarioBruto*0.06);
            } else {
                
            }
            return salarioLiquido;
    }
}
