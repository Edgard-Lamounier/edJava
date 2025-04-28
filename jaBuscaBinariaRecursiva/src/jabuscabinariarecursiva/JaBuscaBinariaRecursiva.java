/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jabuscabinariarecursiva;

/**
 *
 * @author EDGARD LAMOUINIER
 * 
 */
public class JaBuscaBinariaRecursiva {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        BuscaBinariaRecursiva  b = new BuscaBinariaRecursiva();
        
       
        
        int SIZE = 8;
        Comparable [ ] a = new Integer [ SIZE ];
          
        a[ 0 ] = 1;
        a[ 1 ] = 3;
        a[ 2 ] = 4;
        a[ 3 ] = 5;
        a[ 4 ] = 17;
        a[ 5 ] = 18;
        a[ 6 ] = 31;
        a[ 7 ] = 33;
        
        int i = b.binarySearch( a, 17 );
        System.out.println( "Encontrado " + 17 + " em " +
                                     i );
        
         /*
        int SIZE = 8;
        Comparable [ ] a = new Integer [ SIZE ];
        for( int i = 0; i < SIZE; i++ )
            a[ i ] = new Integer( i * 2 );

        for( int i = 0; i < SIZE * 2; i++ )
            System.out.println( "Encontrado " + i + " em " +
                                     b.binarySearch( a, new Integer( i ) ) );
       */
    }
}
