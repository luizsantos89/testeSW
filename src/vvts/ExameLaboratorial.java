package vvts;

public class ExameLaboratorial {
    private int triglicerides;
    private int colesterolTotal;
    private int colesterolHdl;
    private int colesterolLdl;
    private int colesterolVldl;
    private int glicose;

    public int getTriglicerides() {
        return triglicerides;
    }

    public void setTriglicerides(int triglicerides) {
        this.triglicerides = triglicerides;
    }

    public int getColesterolTotal() {
        return colesterolTotal;
    }

    public void setColesterolTotal(int colesterolTotal) {
        this.colesterolTotal = colesterolTotal;
    }

    public int getColesterolHdl() {
        return colesterolHdl;
    }

    public void setColesterolHdl(int colesterolHdl) {
        this.colesterolHdl = colesterolHdl;
    }

    public int getColesterolLdl() {
        return colesterolLdl;
    }

    public void setColesterolLdl(int colesterolLdl) {
        this.colesterolLdl = colesterolLdl;
    }

    public int getColesterolVldl() {
        return colesterolVldl;
    }

    public void setColesterolVldl(int colesterolVldl) {
        this.colesterolVldl = colesterolVldl;
    }

    public int getGlicose() {
        return glicose;
    }

    public void setGlicose(int glicose) {
        this.glicose = glicose;
    }
    
    public String verificaTriglicerides() {
        String resultado = null;
        if (triglicerides < 150)
            resultado = "Nível desejável";
        else if (triglicerides < 200)
            resultado = "Nível limítrofe";
        else if (triglicerides < 500)
            resultado = "Nível alto";
        else
            resultado = "Nível muito alto";
        return resultado;
    }
    
    public String verificaColTotal(){
        String resultado = null;
        if(colesterolTotal < 200)
            resultado = "Desejável";
        else if(colesterolTotal < 240)
            resultado = "Limítrofe";
        else 
            resultado = "Elevado";
        return resultado;
    }
    
    public String verificaColHDL() {
        String resultado = null;
        if (colesterolHdl < 40) //1
            resultado = "Baixo";//2
        else if(colesterolHdl <= 60)//3
            resultado = "Normal";//4
        else
            resultado = "Desejável";//5
        return resultado;//6
    }
    
    public String verificaColLDL() {
        String resultado = null;
        if (colesterolLdl < 100)
            resultado = "Ótimo";
        else if(colesterolLdl < 130)
            resultado = "Desejável";
        else if(colesterolLdl < 160)
            resultado = "Limítrofe";
        else if(colesterolLdl < 190)
            resultado = "Alto";
        else
            resultado = "Muito alto";
        return resultado;
    }
    
    public String verificaColVLDL() {
        String resultado = null;
        if(colesterolVldl < 30)
            resultado = "Nível desejável";
        else if(colesterolVldl <= 40)
            resultado = "Nível limítrofe";
        else 
            resultado = "Nível elevado";
        return resultado;
    }
    
    public String verificaGlicose() {
        String resultado = null;
        if (glicose < 60)
            resultado = "Hipoglicemia";
        else if (glicose < 100)
            resultado = "Desejável";
        else if (glicose <= 125)
            resultado = "Glicemia de jejum inapropriada";
        else 
            resultado = "Diabetes";
        return resultado;
    }

}