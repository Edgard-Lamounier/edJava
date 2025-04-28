/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalistade;

import java.util.Scanner;

/**
 *
 * @author EDGARD LAMOUNIER 
 */
public class Lista {
    private NohLista    INICIO;
    private NohLista    FIM;
    
    public Lista() {
        INICIO = null;
        FIM = null; 
    }
        
    public boolean estaVazia() {
       return INICIO == null; // retorna true se a Lista estiver vazia
    }
    
    public void insereNoInicio(int n) {
        NohLista newNoh = new NohLista(n);

        if( estaVazia() ) 
            INICIO = FIM = newNoh;
        else {
            newNoh.setNext(INICIO);
            INICIO.setPrior(newNoh);
            INICIO = newNoh;
        }    
    } // fim do metodo insereNoInicio()
    
    public void insereNoFim(int n) {
        NohLista newNoh = new NohLista(n);

        if( estaVazia() ) 
            INICIO = FIM = newNoh;
        else {
            newNoh.setPrior(FIM);
            FIM.setNext(newNoh);
            FIM = newNoh;
        }    
    } // fim do metodo insereNoFim()
    
    public void imprime() {
        if ( estaVazia() ) {
            System.out.printf( "Lista vazia!");
            return;
        }
        
        System.out.printf( "A lista eh: ");
        NohLista atual = INICIO;
        
        while (atual != null) {
            System.out.print(atual.getData() + " " ); 
            atual = atual.getNext(); 
        }
        System.out.println( "\n"); 
    } // fim do metodo imprime()
    
    public int removeDoInicio() throws estaVaziaException {
       if( estaVazia() ) 
           throw new estaVaziaException();
       
       int itemRemovido = INICIO.getData();
       
       // atualiza referencias INICIO e FIM
       if( INICIO == FIM )
          INICIO = FIM = null;
       else {
           INICIO = INICIO.getNext();
           INICIO.setPrior(null);
       } // fim do else
       return itemRemovido; 
    }
    
    public int removeDoFim() throws estaVaziaException {
      if( estaVazia() ) 
           throw new estaVaziaException();
      
      int itemRemovido = FIM.getData();
      
      if ( INICIO == FIM )
          INICIO = FIM = null;
      else {
          
          NohLista  atual = INICIO;
          
          while( atual.getNext() != FIM )
                atual = atual.getNext();
          
          FIM = atual; 
          atual.setNext(null);
      } // fim do else
      
      return itemRemovido;
    } // fim do metodo removeDoFim
    
    public int removeDoMeio() throws estaVaziaException {
      if( estaVazia() ) 
           throw new estaVaziaException();
      
      System.out.println("Escolha um numero do MEIO da lista: \n");
      
      this.imprime();
      
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      
      System.out.println("Numero escolhido: " + num1 +  "\n");
      
      if(encontraElementoNaLista(num1) == true)
		{
		    System.out.println("Encontrado Elemento na Lista");
                    NohLista    tempNoh = encontraNoh(num1);
		    return(removeNohMeio(tempNoh));
		}

		else 
		{
                    System.out.println("Numero não se encontra na lista...");
                    return 0;
		}
          
    } // fim do metodo removeDoMeio
    
    public boolean encontraElementoNaLista(int n) {
    NohLista     tempNoh = INICIO;
    boolean      veredito = false;
    
    while(tempNoh != null)   
	if(tempNoh.getData() == n)
            veredito = true;
	else
            tempNoh = tempNoh.getNext();
        
    return veredito;
    } // fim do metodo encontraElementoNaLista
    
    // Este método pressupõe que intEncontrado está na Lista!
    public NohLista encontraNoh(int intEncontrado) {
    NohLista   foundNoh = INICIO;
	while(foundNoh != null) // 
	{
	    if(foundNoh.getData() == intEncontrado)
		return(foundNoh);
            else
		foundNoh = foundNoh.getNext();
	}
        return null;
    } // fim do método encontraNoh
    
    
    
    public int removeNohMeio(NohLista  removePtr)
    {
        int   tempData = removePtr.getData(); // salva a informação
        
        // refaz o encadeamento 
        (removePtr.getPrior()).setNext(removePtr.getNext());
	(removePtr.getNext()).setPrior(removePtr.getPrior());
        
        return tempData;
    } // fim do método removeNohMeio 
    
} // fim da classe Lista 
