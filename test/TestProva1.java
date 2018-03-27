
import vvts.Prova1;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

public class TestProva1 extends TestCase{
    
    Prova1 prova;
    
    double faixa1 = 1360.7*0.8;
    double faixa2 = ((2268.05-1360.7)*0.50)+1088.56;
    double faixa3 = 1542.24;

    protected void setUp() throws Exception {
        super.setUp();
        prova = new Prova1();
    }
    
    public void testCaso_Faixa1() {
        prova.setSalario(1360.7);
        assertEquals(faixa1, prova.calculaSeguroDesemprego());
    }
    
    public void testCaso_Faixa2() {
        prova.setSalario(2268.05);
        assertEquals(faixa2, prova.calculaSeguroDesemprego());
    }
    
    public void testCaso_Faixa3() {
        prova.setSalario(2268.06);
        assertEquals(faixa3, prova.calculaSeguroDesemprego());
    }
}
