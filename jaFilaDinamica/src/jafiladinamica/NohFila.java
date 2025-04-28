/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jafiladinamica;

/**
 *
 * @author EDGARD
 */
public class NohFila {
    private int		   data;
    private NohFila       nextNoh;
    
    public NohFila() {
	data = 0;
	nextNoh = null;
}
    
    public NohFila(int   valor) {
	data = valor;
	nextNoh = null;
}
    
    public NohFila(int  valor, NohFila  next) {
	data = valor;
	nextNoh = next;
}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NohFila getNextNoh() {
        return nextNoh;
    }

    public void setNextNoh(NohFila nextNoh) {
        this.nextNoh = nextNoh;
    }
    
}
