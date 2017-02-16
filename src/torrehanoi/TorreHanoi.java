/*
Torre Hanoi
 */
package torrehanoi;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class TorreHanoi {


    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);
        
        int n;
        System.out.println("Numero de disco");
        n = scanner.nextInt();
          torreHanoi(n, 1, 2, 3);
        //
    }
    
    public static void torreHanoi(int n, int origen, int aux, int destino){
        
        if (n==1) {
            System.out.println("Mover disco de " + origen + " a " + destino );
        }
        else{
            torreHanoi(n-1, origen, destino, aux);
            System.out.println("Mover disco de " + origen + " a " + destino);
        torreHanoi(n-1, aux, origen, destino);
        }
    }
    
}
