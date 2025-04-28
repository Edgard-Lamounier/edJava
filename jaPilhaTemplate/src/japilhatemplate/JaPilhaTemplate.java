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
public class JaPilhaTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha<Integer>  pInt = new Pilha(10);
        
        Pilha<Double>   pDble = new Pilha(10);
        
        pInt.push(5);
        pDble.push(4.0);
        
        pInt.printPilha();
        pDble.printPilha();
    }
    
}
