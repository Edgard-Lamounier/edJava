/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japilhaint;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class JaPilhaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha p = new Pilha();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        p.empilhar(4);
        p.empilhar(5);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }



    }
    
}
