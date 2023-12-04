
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introducir un numero entero: ");
        n = sc.nextInt();
        int[] a = new int[n];
        rellenarAleatorio(a);
        mostarContenidoArrayPositivos(a);
        
    }
    
    public static void mostarContenidoArrayPositivos(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                System.out.println("Posicion " + i + ": " + array[i] + " -- es positivo");
            }
            
        }
    }
    
    public static void rellenarAleatorio(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(-10,10);
            
        }
    }
    
    public static int aleatorio(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
  
}
