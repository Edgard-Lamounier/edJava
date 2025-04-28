/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jalistade_template;

/**
 *
 * @author EDGARD
 */
public class JaListaDE_Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Integer> listaInt = new Lista< Integer >();
        Lista<Double>  listaDouble = new Lista<  >();
        
        listaInt.insereNoInicio(-1);
        listaInt.insereNoInicio(0);
        listaInt.insereNoInicio(1);
        listaInt.insereNoInicio(2);
        
        listaDouble.insereNoInicio(-1.0);
        listaDouble.insereNoInicio(0.0);
        listaDouble.insereNoInicio(1.0);
        listaDouble.insereNoInicio(2.0);
        
        listaInt.imprime();
        listaDouble.imprime();
    }
    
}
