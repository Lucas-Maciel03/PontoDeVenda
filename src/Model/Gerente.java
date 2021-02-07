package Model;
import java.util.ArrayList;

public class Gerente extends Funcionario{
    ArrayList <Gerente> listagerente ;
    public Gerente(){
      listagerente = new ArrayList();
    }//fim do constutor
    
    public void Cadastrar(Gerente gerente){
        listagerente.add(gerente);
    }//fim do metodo de cadastrar
    
    public Gerente Pesquisar(String nome){
        for(Gerente  aux:listagerente){
          if(aux.getNome().equalsIgnoreCase(nome)){
          return aux;
          }//fim if
        }//fim for
   return null;     
  }
     public boolean Excluir(String nome){
  
      for(Gerente aux:listagerente){
          if(aux.getNome().equalsIgnoreCase(nome)){
          listagerente.remove(aux);
              return true;
              
            }
      }
   return false;
  }  
     
      public Gerente Editar(String gerente){
        
        int cont=0;
        for(Gerente aux:listagerente){
            if (aux.getNome().equalsIgnoreCase(gerente)){
      listagerente.add(cont, aux);
      
         return aux;
         
            }cont++;
        }
     
    return null;
    
    }
}
