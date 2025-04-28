/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japilha;

/**
 *
 * @author Edgard
 */
public class JaPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        p1.printPilha();
        p1.push(5);
        p1.push(8);
        p1.push(3);
        p1.printPilha();
        System.out.println("Desempilhando..." + p1.pop());
        p1.printPilha();
        
        
        Pilha p2 = new Pilha();
        p2.push(10);
        p2.push(7);
        p2.push(1);
        p2.printPilha();
        
        /*
        Pilha p2 = new Pilha();
        System.out.println("**** NOVO TESTE ***");
        p1.printPilha();
        p1.push(5);
        p1.push(8);
        p1.push(3);
        p1.printPilha();
        p1.push(2);
        p1.printPilha();
        System.out.println("**** AGORA O OBJETO p2 ***");
        p2.printPilha();
        p2.push(10);
        p2.push(7);
        p2.push(1);
        p2.printPilha();
 */       
//        System.out.println(p1.pop());
//        System.out.println(p1.pop());
//        System.out.println(p1.pop());
//        p1.printPilha();
//        System.out.println(p1.pop());
//        p1.printPilha();
    }
}
