 
import vvts.Imc;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import vvts.ExameLaboratorial;

public class TestImc extends TestCase{   

    Imc imc;

    protected void setUp() throws Exception {
        super.setUp();
        imc = new Imc();
    }
    
    public void testFeminino_AbaixoPeso() {
        imc.setSexo("feminino");
        imc.setAltura(1);
        imc.setPeso(19);
        assertEquals("Abaixo do peso", imc.calculaImc());
    }
    
    public void testFeminino_PesoNormal() {
        imc.setSexo("feminino");
        imc.setAltura(1);
        imc.setPeso(25.7);
        assertEquals("Peso normal", imc.calculaImc());
    }
    
    public void testFeminino_MargAcimaPeso() {
        imc.setSexo("feminino");
        imc.setAltura(1);
        imc.setPeso(27.2);
        assertEquals("Marginalmente acima do peso", imc.calculaImc());
    }
    
    public void testFeminino_AcimaPeso() {
        imc.setSexo("feminino");
        imc.setAltura(1);
        imc.setPeso(32.2);
        assertEquals("Acima do peso", imc.calculaImc());
    }
    
    public void testFeminino_Obeso() {
        imc.setSexo("feminino");
        imc.setAltura(1);
        imc.setPeso(32.3);
        assertEquals("Obeso", imc.calculaImc());
    }
    
    public void testMasculino_AbaixoPeso() {
        imc.setSexo("masculino");
        imc.setAltura(1);
        imc.setPeso(20.6);
        assertEquals("Abaixo do peso", imc.calculaImc());
    }
    
    public void testMasculino_PesoNormal() {
        imc.setSexo("masculino");
        imc.setAltura(1);
        imc.setPeso(26.3);
        assertEquals("Peso normal", imc.calculaImc());
    }
    
    public void testMasculino_MargAcimaPeso() {
        imc.setSexo("masculino");
        imc.setAltura(1);
        imc.setPeso(27.7);
        assertEquals("Marginalmente acima do peso", imc.calculaImc());
    }
    
    public void testMasculino_AcimaPeso() {
        imc.setSexo("masculino");
        imc.setAltura(1);
        imc.setPeso(31.0);
        assertEquals("Acima do peso", imc.calculaImc());
    }
    
    public void testMasculino_Obeso() {
        imc.setSexo("masculino");
        imc.setAltura(1);
        imc.setPeso(31.1);
        assertEquals("Obeso", imc.calculaImc());
    }
}
