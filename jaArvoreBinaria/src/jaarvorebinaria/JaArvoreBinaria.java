/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaarvorebinaria;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class JaArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new JaArvoreBinaria().run(); 
    }
    
    static class No {  
  
        No esquerda;  
        No direita;  
        int valor;  
  
        public No(int valor) {  
            this.valor = valor;  
        }  
    }  
  
    public void run() {  
        No raiz = new No(20);  
        System.out.println("Exemplo de Arvore Binaria");  
        System.out.println("Criando arvore com a raiz " + raiz.valor);  
        inserir(raiz, 22);  
        inserir(raiz, 6);  
        inserir(raiz, 15);  
        inserir(raiz, 8);  
        inserir(raiz, 17);  
        inserir(raiz, 7);  
        inserir(raiz, 3);  
        inserir(raiz, 11);  
        inserir(raiz, 9); 
        inorderTraversal(raiz);
        System.out.println();
        remover(raiz, 15); 
        inorderTraversal(raiz);
        System.out.println();
    }  
  
    public void inserir(No node, int valor) {  
        if (valor < node.valor) {  
            if (node.esquerda != null) {  
                inserir(node.esquerda, valor);  
            } else {  
                System.out.println("  Inserindo " + valor + " a esqueda de " + node.valor);  
                node.esquerda = new No(valor);  
            }  
        } else if (valor > node.valor) {  
            if (node.direita != null) {  
                inserir(node.direita, valor);  
            } else {  
                System.out.println("  Inserindo " + valor + " a direita de " + node.valor);  
                node.direita = new No(valor);  
            }  
        }  
    }  
  
    public No remover(No node, int valor) {  
        System.out.println("  Correndo No " + node.valor);  
        if (node == null) {  
            System.out.println("  Arvore vazia ");  
        }  
        if (valor < node.valor) {  
            node.esquerda = remover(node.esquerda, valor);  
              
        } else if (valor > node.valor) {  
            node.direita = remover(node.direita, valor);  
  
        } else if (node.esquerda != null && node.direita != null)  // 2 filhos  
        {  
            System.out.println("  Removeu No " + node.valor);  
            node.valor = encontraMinimo(node.direita).valor;  
            node.direita = removeMinimo(node.direita);  
        } else {  
            System.out.println("  Removeu No " + node.valor);  
            node = (node.esquerda == null) ? node.esquerda : node.direita;  
        }  
        return node;  
    }  
  
    public No removeMinimo(No node) {  
        if (node == null) {  
            System.out.println("  ERRO ");  
        } else if (node.esquerda != null) {  
            node.esquerda = removeMinimo(node.esquerda);  
            return node;  
        } else {  
            return node.direita;  
        }  
        return null;  
    }  
  
    public No encontraMinimo(No node) {  
        if (node != null) {  
            while (node.esquerda != null) {  
                node = node.esquerda;  
            }  
        }  
        return node;  
    }
    
    public void inorderTraversal( No node ) {
        inorderHelper( node ); 
    }
    
    private void inorderHelper( No node )
    {
        if ( node == null)
            return;
        
        inorderHelper(node.esquerda);
        System.out.printf( "%s ", node.valor);
        inorderHelper(node.direita);
    }
            
}
