/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class Practica02 {
    public static void main(String[] args) {
        int n= 12;
        cambiaValor(n);
        System.out.println("El valor de n es: " + n);
        
        int[]a = new int[2];
        a[0] = 12;
        cambiarValorArray(a);
        System.out.println("El valor de a[0] es: " + a[0]);
    }
    
    public static void cambiarValorArray(int[] a){
     a[0] = 18;   
    }
    
    
    public static void cambiaValor(int n){
        n = 18;
        
    }
    
}
