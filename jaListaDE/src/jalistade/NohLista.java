/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jalistade;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class NohLista {
    private int		   data;
    private NohLista       prior;
    private NohLista       next; 
    
    public NohLista() {
        data = 0;
        prior = null;
        next = null; 
    }
    
    public NohLista(int n) {
        data = n;
        prior = null;
        next = null; 
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NohLista getPrior() {
        return prior;
    }

    public void setPrior(NohLista prior) {
        this.prior = prior;
    }

    public NohLista getNext() {
        return next;
    }

    public void setNext(NohLista next) {
        this.next = next;
    }
    
} // fim da classe NohLista
