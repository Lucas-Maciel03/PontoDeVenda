package Model;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private String codigodebarra;
    private String descricao;
    private String validade;
    private float valor;
    private int quantidade;
    private Gerente geren;  
    
    //criacao do array
    ArrayList <Produto> listaproduto ;

    public Produto(){
    geren=new Gerente();
    listaproduto = new ArrayList();
    }//fim do construtor
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //codigo de barra
      public String getCodigodebarra() {
        return codigodebarra;
    }
    public void setCodigodebarra(String codigodebarra) {
        this.codigodebarra = codigodebarra;
    }
    
//descricao
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
//validade
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
//valor
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
//quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    //metodos
     public void Cadastrar(Produto produto){
        listaproduto.add(produto);
    }
    public Produto Pesquisar(String nome){
        for(Produto aux: listaproduto){
            if(aux.getNome().equalsIgnoreCase(nome)){
                return aux;
            }
         }
      return null;   
    }   
   public boolean Excluir(String nome){
  
      for(Produto aux:listaproduto){
          if(aux.getNome().equalsIgnoreCase(nome)){
          listaproduto.remove(aux);
              return true;
              
            }
      }
   return false;
  }  
    public Produto Editar(String  produto){
        
        int cont=0;
        for(Produto aux:listaproduto){
            if (aux.getNome().equalsIgnoreCase(produto)){
      listaproduto.set(cont, aux);
      
         return aux;
            } cont++;
        }
               
            
    return null;
    
    }

  
}
