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
