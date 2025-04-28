/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jafiladinamica;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class JaFilaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila f = new Fila();
        
        f.insere(5);
        f.insere(8);
        f.insere(3);
        f.print();
        System.out.println("Removendo ..." + f.remove());
        f.print();
        
    }
    
}
