package Model;

public class Endereco {
    private String bairro;
    private String rua;
    private int casa;
    
    public Endereco(){
    
    }//fim do construtor

    
    public String getbairro() {
        return bairro;
    }

    public void setbairro(String bairro) {
        this.bairro = bairro;
    }

   
    public String getrua() {
        return rua;
    }

    public void setrua(String rua) {
        this.rua = rua;
    }
    public int getcasa() {
        return casa;
    }

    public void setcasa(int casa) {
        this.casa = casa;
    }
    
    
    
}//fim da class
