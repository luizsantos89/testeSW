
import vvts.Pessoa;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

public class TestPessoa extends TestCase {

    Pessoa pessoa;

    protected void setUp() throws Exception {
        super.setUp();
        pessoa = new Pessoa();
    }

    public void testImc_FemAbaixoPeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(19.0);
        pessoa.setAltura(1.0);
        assertEquals("Abaixo do peso", pessoa.calculaIMC());
    }

    public void testImc_FemPesoNormal(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(25.7);
        pessoa.setAltura(1.0);
        assertEquals("Peso normal", pessoa.calculaIMC());
    }

    public void testImc_FemMargAcimaPeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(27.2);
        pessoa.setAltura(1.0);
        assertEquals("Marginalmente acima do peso", pessoa.calculaIMC());
    }

    public void testImc_FemAcimaPeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(32.2);
        pessoa.setAltura(1.0);
        assertEquals("Acima do peso", pessoa.calculaIMC());
    }

    public void testImc_FemObeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(32.3);
        pessoa.setAltura(1.0);
        assertEquals("Obeso", pessoa.calculaIMC());
    }

    public void testImc_MascAbaixoPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(20.6);
        pessoa.setAltura(1.0);
        assertEquals("Abaixo do peso", pessoa.calculaIMC());
    }

    public void testImc_MascPesoNormal(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(26.3);
        pessoa.setAltura(1.0);
        assertEquals("Peso normal", pessoa.calculaIMC());
    }

    public void testImc_MascMargAcimaPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(27.7);
        pessoa.setAltura(1.0);
        assertEquals("Marginalmente acima do peso", pessoa.calculaIMC());
    }

    public void testImc_MascAcimaPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(31.0);
        pessoa.setAltura(1.0);
        assertEquals("Acima do peso", pessoa.calculaIMC());
    }

    public void testImc_MascObeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(31.1);
        pessoa.setAltura(1.0);
        assertEquals("Obeso", pessoa.calculaIMC());
    }
}
