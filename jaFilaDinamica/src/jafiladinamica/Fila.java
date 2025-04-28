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
public class Fila {
    private NohFila start;
    private NohFila end;
    
    public Fila() {
        start = end = null; 
    }
    
    public void insere(int insertItem) {
	if(start == null && end == null) { // Fila vazia
            NohFila  novoNoh = new NohFila(insertItem); 
            start = novoNoh;
            end = novoNoh; 
        }
        else {
            NohFila  novoNoh = new NohFila(insertItem);
            end.setNextNoh(novoNoh); // encadeando
            end = novoNoh;
        }               
    }
    
    public int remove() {
	if(start == null && end == null) {
	  System.out.println("Fila Vazia - Impossivel Remover"); 	
          return 0;
	}    
        // Quando a fila não está vazia
        else {
		int tempData = start.getData();
		// NohFila   tempNoh = start;
		start = start.getNextNoh();
		// tempNoh = null;
		return tempData;
        }
    }   

        
    public void print() {
	if(start == null)
		System.out.println("Fila Vazia");
        else {
                System.out.println("Status atual da Fila:");
                NohFila temp = start;
          
                while(temp != null) {
                System.out.println(temp.getData());
			  temp = temp.getNextNoh();  
                } // fim do while
                     
        } // fim do else 
    }
}
