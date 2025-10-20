/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosjava;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class GenerarNumerosAleatoriosJava {
    public static void main (String [] args){
        //Cuando el nuemro es decimal:
        double n = Math.random(); 
        System.out.println(n);
        //Cuando el numero es entero:
        int num = (int)(Math.random()*10+1);//Calcular un numero entre 0-10 inclusive el 10, por tal razon se coloca +1
        System.out.println(num );
        //Para cuando hay un minimo y un maximo:
        int max = 10;
        int min = 5;
        int numero = (int)(Math.random()*(max-min+1)+min);/*Math.random siempre va a iniciar desde 0 por lo que para que inicie desde 
         el min se coloca +min*/
        System.out.println(numero);
        
    }
    
}
