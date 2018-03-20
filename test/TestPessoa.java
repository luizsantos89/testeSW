
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
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.99);
        assertEquals("Abaixo do peso", pessoa.calculaIMC());
    }

    public void testImc_FemPesoNormal(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.71);
        assertEquals("Peso normal", pessoa.calculaIMC());
    }

    public void testImc_FemMargAcimaPeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.66);
        assertEquals("Marginalmente acima do peso", pessoa.calculaIMC());
    }

    public void testImc_FemAcimaPeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.53);
        assertEquals("Acima do peso", pessoa.calculaIMC());
    }

    public void testImc_FemObeso(){
        pessoa.setSexo("feminino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.52);
        assertEquals("Obeso", pessoa.calculaIMC());
    }

    public void testImc_MascAbaixoPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.91);
        assertEquals("Abaixo do peso", pessoa.calculaIMC());
    }

    public void testImc_MascPesoNormal(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.69);
        assertEquals("Peso normal", pessoa.calculaIMC());
    }

    public void testImc_MascMargAcimaPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.63);
        assertEquals("Marginalmente acima do peso", pessoa.calculaIMC());
    }

    public void testImc_MascAcimaPeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.56);
        assertEquals("Acima do peso", pessoa.calculaIMC());
    }

    public void testImc_MascObeso(){
        pessoa.setSexo("masculino");
        pessoa.setPeso(75.0);
        pessoa.setAltura(1.55);
        assertEquals("Obeso", pessoa.calculaIMC());
    }
}
