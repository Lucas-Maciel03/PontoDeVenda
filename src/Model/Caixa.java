package Model;

import java.util.ArrayList;


public class Caixa extends Funcionario{
    ArrayList<Caixa> listacaixa;
    
    public Caixa(){
    listacaixa = new ArrayList();
    }//fim construtor
    
    public void Cadastrar(Caixa caixa){
    listacaixa.add(caixa);
    }
    
  
    public Caixa Pesquisar(String nome){
        for(Caixa  aux:listacaixa){
          if(aux.getNome().equalsIgnoreCase(nome)){
          return aux;
          }//fim if
        }//fim for
   return null;     
  }
     public boolean Excluir(String nome){
  
      for(Caixa aux:listacaixa){
          if(aux.getNome().equalsIgnoreCase(nome)){
          listacaixa.remove(aux);
              return true;
              
            }
      }
   return false;
         
  }  
   
     public Caixa Editar(String caixa){
        
        int cont=0;
        for(Caixa aux:listacaixa){
            if (aux.getNome().equalsIgnoreCase(caixa)){
      listacaixa.add(cont, aux);
       
       System.out.println(cont); 
       
         return aux;
         
            }cont++;
        }
             
            
    return null;
    
    }
}//fim class
