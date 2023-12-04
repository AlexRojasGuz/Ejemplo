
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//        1.- Genera un array de enteros de 20 posiciones. 
//        Posteriormente rellena ese array con números aleatorios del -10 al 10. 
//        Muestra el contenido del array y posteriormente recorre el array para que todos los valores inferiores a cero cambien a 1. 
//        Muestra de nuevo el contenido del array.
/**
 *
 * @author dev
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        rellenarAleatorio(a);
        mostrarContenidoArray(a);
        modificarValores(a);
        mostrarContenidoArray(a);
    }
     public static void modificarValores(int[] array){
         for (int i = 0; i < array.length; i++) {
             if(array[i] < 0){
                array[i] = 1;
             }
             
             
         }
     }
    
    
    public static void mostrarContenidoArray(int[] array){
        System.out.println("------Contenido del array------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("posicion " + i + ": " + array[i]);
            
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
