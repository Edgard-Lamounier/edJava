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
public class Pilha {
    public int[] pilha;
    public int posicaoPilha; // topo

    public Pilha() {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new int[1000];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public int exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            System.out.println("Pilha Vazia"); 
            return 0;
        }
        return this.pilha[this.posicaoPilha];
    }

    public int desempilhar() {
        //pop
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia");
            return 0;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(int valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }

    }

}
