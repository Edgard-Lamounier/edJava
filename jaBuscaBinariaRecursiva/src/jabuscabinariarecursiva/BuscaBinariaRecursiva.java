/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jabuscabinariarecursiva;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class BuscaBinariaRecursiva {
    public static final int NOT_FOUND = -1;

    public static int binarySearch( Comparable [ ] a, Comparable x )
    {
        return binarySearch( a, x, 0, a.length -1 );
    }
    
    private static int binarySearch( Comparable [ ] a, Comparable x,
                                     int low, int high )
    {
        if( low > high )
            return NOT_FOUND;

        int mid = ( low + high ) / 2;

        if( a[ mid ].compareTo( x ) < 0 )
            return binarySearch( a, x, mid + 1, high );
        else if( a[ mid ].compareTo( x ) > 0 )
            return binarySearch( a, x, low, mid - 1 );
        else
            return mid;
    }

}
