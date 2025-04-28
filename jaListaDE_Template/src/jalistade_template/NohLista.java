/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jalistade_template;

/**
 *
 * @author EDGARD LAMOUNIER
 * @param <T>
 */

// CLASSES GENERICAS:fornecem um meio de descrever conceito de 
// uma classe de uma maneira independente do tipo. 
public class NohLista<T extends Object> {
    private T		        data;
    private NohLista< T >       prior;
    private NohLista< T >       next; 
    
    public NohLista() {
        prior = null;
        next = null; 
    }
    
    public NohLista( T object) {
        data = object;
        prior = null;
        next = null; 
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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
