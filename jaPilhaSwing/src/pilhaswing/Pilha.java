/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaswing;

/**
 *
 * @author Edgard
 */
public class Pilha {
   private NohPilha topo;
    
    public Pilha() {
        topo = null; // nÃ£o foi inserido elemento
    }
    
    public boolean isEmpty() {
        if (topo == null)
            return true;
        else
            return false;
    }
    
    public void push(int  insertItem) {
        if(isEmpty()) 
            topo = new NohPilha(insertItem);
        else {
            NohPilha  next = new NohPilha(insertItem, topo);
            topo = next;
        }                
    } // fim do mÃ©todo push
    
    public void printConsole() {
        if(isEmpty())
          System.out.println("Pilha Vazia");
        else {
          System.out.println("Status atual da Pilha:");
          NohPilha temp = topo;
          
          while(temp != null) {
              System.out.println(temp.getData());
              temp = temp.getNext();
              
          } // fim do while
                     
        } // fim do else 
    } // fim do metodo printConsole()
    
    public String printAreaTexto() {
        String textoTela = "";
        if(isEmpty()) {
          System.out.println("Pilha Vazia");
          return textoTela; 
        }
        else {
          NohPilha temp = topo;
          
          while(temp != null) {
              textoTela = textoTela+String.valueOf(temp.getData()) +"\n";
              temp = temp.getNext();
              
          } // fim do while 
        return textoTela;             
        } // fim do else 
    } // fim do metodo printAreaTexto()
    
    public int pop() {
        if(isEmpty()) {
           System.out.println("Pilha Vazia");
           return 0;
          }
        else {
          int temp = topo.getData();
          topo = topo.getNext();
          return(temp);
        } 
    } // fim do metodo pop() 
} // fim da classe Pilha
