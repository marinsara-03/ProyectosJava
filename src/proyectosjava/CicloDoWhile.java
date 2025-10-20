/**/
package proyectosjava;

import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int numero = 0;
        System.out.println("Ingrese un numero: ");
        numero = read.nextInt();
        
        do{ //El do perimite pasar por alto el while una sola vez 
            System.out.println("Usted ingreso el siguiente numero: "+numero);
            System.out.println("ingrese un numero: ");
            numero = read.nextInt();
        }
        while(numero!=0); 
    }
    
}
