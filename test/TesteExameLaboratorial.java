
import vvts.Pessoa;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import vvts.ExameLaboratorial;

public class TesteExameLaboratorial extends TestCase {

    ExameLaboratorial exame;

    protected void setUp() throws Exception {
        super.setUp();
        exame = new ExameLaboratorial();
    }
    
    public void testTriglicerides_Desejavel() {
        exame.setTriglicerides(149);
        assertEquals("Nível desejável", exame.verificaTriglicerides());
    }
    
    public void testTriglicerides_Limitrofe() {
        exame.setTriglicerides(199);
        assertEquals("Nível limítrofe", exame.verificaTriglicerides());
    }
    
    public void testTriglicerides_Alto() {
        exame.setTriglicerides(499);
        assertEquals("Nível alto", exame.verificaTriglicerides());
    }
    
    public void testTriglicerides_MuitoAlto() {
        exame.setTriglicerides(500);
        assertEquals("Nível muito alto", exame.verificaTriglicerides());
    }
    
    public void testColesterolTotal_Desejavel() {
        exame.setColesterolTotal(199);
        assertEquals("Desejável",exame.verificaColTotal());
    }
    
    public void testColesterolTotal_Limitrofe() {
        exame.setColesterolTotal(239);
        assertEquals("Limítrofe",exame.verificaColTotal());
    }
    
    public void testColesterolTotal_Elevado() {
        exame.setColesterolTotal(240);
        assertEquals("Elevado",exame.verificaColTotal());
    }
    
    public void testColesterolHdl_Baixo() {
        exame.setColesterolHdl(39);
        assertEquals("Baixo",exame.verificaColHDL());
    }
    
    public void testColesterolHdl_Normal() {
        exame.setColesterolHdl(60);
        assertEquals("Normal",exame.verificaColHDL());
    }
    
    public void testColesterolHdl_Desejavel() {
        exame.setColesterolHdl(61);
        assertEquals("Desejável",exame.verificaColHDL());
    }
    
    public void testColesterolLDL_Otimo(){
        exame.setColesterolLdl(99);
        assertEquals("Ótimo",exame.verificaColLDL());
    }
    
    public void testColesterolLDL_Desejavel(){
        exame.setColesterolLdl(129);
        assertEquals("Desejável",exame.verificaColLDL());
    }
    
    public void testColesterolLDL_Limitrofe(){
        exame.setColesterolLdl(149);
        assertEquals("Limítrofe",exame.verificaColLDL());
    }
    
    public void testColesterolLDL_Alto(){
        exame.setColesterolLdl(189);
        assertEquals("Alto",exame.verificaColLDL());
    }
    
    public void testColesterolLDL_MuitoAlto(){
        exame.setColesterolLdl(190);
        assertEquals("Muito alto",exame.verificaColLDL());
    }
    
    public void testColesterolVLDL_Desejavel() {
        exame.setColesterolVldl(29);
        assertEquals("Nível desejável", exame.verificaColVLDL());
    }
    
    public void testColesterolVLDL_Limitrofe() {
        exame.setColesterolVldl(40);
        assertEquals("Nível limítrofe", exame.verificaColVLDL());
    }
    
    public void testColesterolVLDL_Elevado() {
        exame.setColesterolVldl(41);
        assertEquals("Nível elevado", exame.verificaColVLDL());
    }
    
    public void testGlicose_Hipoglicemia(){
        exame.setGlicose(59);
        assertEquals("Hipoglicemia",exame.verificaGlicose());
    }
    
    public void testGlicose_Desejavel(){
        exame.setGlicose(99);
        assertEquals("Desejável",exame.verificaGlicose());
    }
    
    public void testGlicose_GlicemiaJejumInapropriada(){
        exame.setGlicose(125);
        assertEquals("Glicemia de jejum inapropriada",exame.verificaGlicose());
    }
    
    public void testGlicose_Diabetes(){
        exame.setGlicose(126);
        assertEquals("Diabetes",exame.verificaGlicose());
    }
}
