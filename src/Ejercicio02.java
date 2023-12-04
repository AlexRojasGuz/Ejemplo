
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.print("Dame un numero");
        a = sc.nextDouble();
        double[]array = new double[20];
        rellenaDatos(a, array);
        mostrarContenidoArray(array);
        
    }
    public static void rellenaDatos(double a, double[] array){
        array[0]= a;
        for (int i = 1; i < array.length; i++) {
            array[i] = 2 * array[i - 1];
            
        }
    }
    
    public static void mostrarContenidoArray(double[] array){
        System.out.println("------Contenido del array------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("posicion " + i + ": " + array[i]);
            
        }
    }
}
