/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jalistade_template;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class Lista<T extends Object> {
    private NohLista< T >    INICIO;
    private NohLista< T >    FIM;
    
    public Lista() {
        INICIO = null;
        FIM = null; 
    }
        
    public boolean estaVazia() {
       return INICIO == null; // retorna true se a Lista estiver vazia
    }
    
    public void insereNoInicio(T n) {
        NohLista newNoh = new NohLista< T >(n);

        if( estaVazia() ) 
            INICIO = FIM = newNoh;
        else {
            newNoh.setNext(INICIO);
            INICIO.setPrior(newNoh);
            INICIO = newNoh;
        }    
    } // fim do metodo insereNoInicio()
    
    public void insereNoFim(T n) {
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
    
    public T removeDoInicio() throws estaVaziaException {
       if( estaVazia() ) 
           throw new estaVaziaException();
       
       T itemRemovido = INICIO.getData();
       
       // atualiza referencias INICIO e FIM
       if( INICIO == FIM )
          INICIO = FIM = null;
       else {
           INICIO = INICIO.getNext();
           INICIO.setPrior(null);
       } // fim do else
       return itemRemovido; 
    }
    
    public T removeDoFim() throws estaVaziaException {
      if( estaVazia() ) 
           throw new estaVaziaException();
      
      T itemRemovido = FIM.getData();
      
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
            
    public boolean encontraElementoNaLista(T n) {
    NohLista     tempNoh = INICIO;
    boolean      veredito = false;
    
    while(tempNoh != null)   
	if(tempNoh.getData() == n)
            veredito = true;
	else
            tempNoh = tempNoh.getPrior();
        
    return veredito;
    } // fim do metodo encontraElementoNaLista
    
    // Este método pressupõe que intEncontrado está na Lista!
    public NohLista encontraNoh(T intEncontrado) {
    NohLista   foundNoh = INICIO;
	while(foundNoh != null) // 
	{
	    if(foundNoh.getData() == intEncontrado)
		return(foundNoh);
            else
		foundNoh = foundNoh.getPrior();
	}
        return null;
    } // fim do método encontraNoh
    
 
} // fim da classe Lista
