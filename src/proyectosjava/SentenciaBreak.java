package proyectosjava;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flaka
 */
public class SentenciaBreak {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        for(int i=1; i<=10; i++){
            System.out.println("El contador va en: "+i);
            if(i==5){//Si esto lo colocamos antes del print se va a ejecutar hasta 4
                break;
            }
        }
    }
}
