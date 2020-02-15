/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg1;

import java.util.Scanner;

/**
 *
 * @author 082170008
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner le = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = le.nextInt();
        
        ImparOuPar(numero);
    }
    public static void ImparOuPar(int numero){
        if(numero%2 == 0)
            System.out.println("Esse número é par");
        else
            System.out.println("Esse número é Ímpar");
    }
    
}
