/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japilhadinamica;

/**
 * @author Edgard Lamounier JR
 */
public class JaPilhaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        System.out.println("Testando a classe Pilha");
        pilha.push(3);

        pilha.push(5);

        pilha.push(8);

        pilha.print();

        System.out.println("Desempilhando o = " + pilha.pop());

        System.out.println("Desempilhando o = " + pilha.pop());

        pilha.push(8);

        pilha.print();
    }
}
