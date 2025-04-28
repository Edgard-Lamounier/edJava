/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japilhadinamica;

/**
 *
 * @author Edgard Lamounier JR
 */
public class Pilha {
    private NohPilha topo;
    
    public Pilha() {
        topo = null; // não foi inserido elemento
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
    } // fim do método push
    
    public void print() {
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
    } // fim do método print
    
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
