/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japilha;

/**
 *
 * @author Edgard Lamounier 
 */
public class Pilha {
    private Integer[] integerArray = new Integer[3];
    private int  topo;
    
    public Pilha() { // construtor default
        for(int i = 0; i < 3; i++) {
            integerArray[i] = 0;
        }
        topo = -1;
    }
    
    public void printPilha () {
        if (topo == -1)
            System.out.println("A pilha esta vazia!");
        else {
          for(int i = topo; i >= 0; i--) {
            System.out.println(integerArray[i]);
             }
        }
    }
    
    public void push(int n) {
        if(topo == 2)
            System.out.println("Pilha Cheia!");
        else
            integerArray[++topo] = n;
    }
    
    public int pop() {
        if (topo == -1) {
             System.out.println("A pilha esta vazia!");
             return(-1000);
        }
         else {
           return(integerArray[topo--]); 
        }
            
    }
    
}
