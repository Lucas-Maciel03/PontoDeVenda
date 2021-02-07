package Model;

public class Funcionario {
    private String nome;
    private int matricula;
    private Contato cont;
    private Endereco end;

    public Funcionario(){
    end = new Endereco();
    cont = new Contato();
    }//fim do construtor

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
     //classes delegadas
    public void setbairro(String bairro){
        end.setbairro(bairro);
    }//fim set bairro
    public String getbairro(){
        return end.getbairro();
    }
    public void setrua(String rua){
    end.setrua(rua);
    }
    public String getrua(){
     return end.getrua();
    }
    public void setcasa(int casa){
    end.setcasa(casa);
    }
    public int getcasa(){
    return end.getcasa();
    }
    public void settelefone(String telefone){
        cont.settelefone(telefone);
    }//fim set telefone
    public String gettelefone(){
        return cont.gettelefone();
    }//fim get telefone
    
    public void Cadastrar(){
       
    }
    public void Pesquisar(){
       
    }
    public void Excluir(){
       
    }
    public void Editar(){
       
    }
}//fim da class
