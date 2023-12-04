/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class Practica {
    public static void main(String[] args) {
        int[] aInt1 = {5,8,7,4,5};
        String[] aString1 = {"Juan","Pepe","Antonio","Alex","Pepe2"};
        
        int longitud = 5;
        int[] aInt2 = new int[longitud];
        
        aInt1[0] = 5;
        System.out.println("El valor de aInt1 en su posicion 0: " + aInt1[0]);
        aInt2[0] = 18;
        System.out.println("El valor de aInt2 en su posicion 0: " + aInt2 [0]);
        
        System.out.println(" la longitud de mi array aInt1: " + aInt1.length);
        
        mostrarSuma1(aInt1);
        
    }
    
    public static void mostrarSuma1(int[] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("El valor del array en la posicion " + i + "es: " + a[i]);
            suma += a[i];
            System.out.println("Llevo acumulado: " + suma);
            
        }
        System.out.println("La suma de los valores es: " + suma);
    }
    
    public static void mostarSuma2(int[] a){
        int suma = 0;
        for (int valor : a){
            suma += valor;
        }
        System.out.println("La suma de los valores es: " + suma);
    }
}
