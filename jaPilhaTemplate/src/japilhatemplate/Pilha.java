/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japilhatemplate;

/**
 *
 * @author Edgard
 */
public class Pilha<T extends Object> {
    // atributos 
    private final T[] integerArray;
    private int   topo;

    // métodos
    public Pilha(int tam) {
        
        integerArray = (T[]) new Object[tam];
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
    } // fim do método printPilha()
    
    public void push(T n) {
        if(topo == integerArray.length)
            System.out.println("Pilha Cheia!");
        else
            integerArray[++topo] = n;
    }
    
} // fim da classe Pilha 
