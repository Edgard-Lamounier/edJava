/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japilhadinamica;

/**
 *
 * @author Edgard
 */
public class NohPilha {
    private int data;
    private NohPilha nextNoh; // autoreferenciamento 

    public NohPilha() {
        data = 0;
        nextNoh = null;
    }
    
    public NohPilha(int valor) {
        data = valor;
        nextNoh = null;
    }
    
    public NohPilha(int valor, NohPilha  noh) {
        data = valor;
        nextNoh = noh;
    }
    
    public int getData() {
        return data;
    }

    public NohPilha getNext() {
        return nextNoh;
    }  
    
} // fim da classe NohPilha
