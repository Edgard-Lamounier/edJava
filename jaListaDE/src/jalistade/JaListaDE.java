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
public class JaListaDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int  removido;
        
        
        lista.insereNoInicio(5);
        lista.insereNoInicio(8);
        lista.insereNoInicio(3);
        
        lista.insereNoFim(15);
        lista.insereNoFim(18);
        lista.insereNoFim(13);
        
        
        
        
        
        
        
        lista.imprime();        
        System.out.println("Elemento do MEIO : " + lista.removeDoMeio());
        
        removido = lista.removeDoInicio();
        System.out.println("Elemento removido : " + removido);
        lista.imprime();
        
        lista.insereNoInicio(4);
        lista.insereNoInicio(9);
        lista.imprime();
        
        removido = lista.removeDoFim();
        System.out.println("Elemento removido : " + removido);
        lista.imprime();
        
        // TESTE DA PILHA
        
        Pilha   pilha = new Pilha();
        
        pilha.insereNoInicio(20); // push(20)
        pilha.insereNoInicio(30); // push(30)
        pilha.insereNoInicio(40); // push(40)
        
        System.out.println("PILHA");
        pilha.imprime();
               
        removido = pilha.removeDoInicio(); // pop()
        System.out.println("Elemento removido : " + removido);
        pilha.imprime();
        
        

    }
    
}
