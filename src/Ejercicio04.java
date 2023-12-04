
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        rellenarAleatorio(a);
        mostarContenido(a);
        a = darLaVuelta1(a);
        mostarContenido(a);
        darLaVuelta2(a);
        mostarContenido(a);

    }
    
    public static void darLaVuelta2(int[] array){
        int t = array.length - 1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            array[i] = array[t];
            array[t] = array[i];
            t--;
            
        }
        
    }
    
    
    public static int[] darLaVuelta1(int[] array){
        int[] r = new int[array.length];
        int t = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            r[t] = array[i];
            t--;
        }
        return r;
    }

    public static void mostarContenido(int[] array) {
        System.out.print("Contenido");
        for (int valor : array) {
            System.out.print("" + valor);

        }
        System.out.println();

    }

    public static void rellenarAleatorio(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(-10, 10);

        }
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
