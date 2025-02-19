/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;

/**
 *
 * @author juanma
 */
public class Intervalos {

    public static void main(String[] args) {
        
        int a = 0;
        String rango = Intervalos.ObtenerIntervalo(a);
        System.out.println("El número "+a+ "esta en el "+rango);
        
    }
    
    public static String ObtenerIntervalo(int  a){
       if (a < -4 ){
           final String A = "Intervalo A";
           return A;
       }
       
       if ( a>= -4 && a < 6){
           return "Intervalo B";
       }else{
           return "Intervalo C";
       }
    }
}
