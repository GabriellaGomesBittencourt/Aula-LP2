/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author 082170008
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palavra;
        
        
        Scanner le = new Scanner(System.in);
        System.out.println("Digite a palavra que quer inverter");
        palavra = le.nextLine();
        
        Inverte(palavra);
    }
    public static void Inverte(String palavra){
            int tamanho;
            String inverte = "";
            tamanho = palavra.length()- 1;
        for (int i = palavra.length() - 1; i >= 0; i--) {
            
            inverte = inverte + palavra.charAt(i);
            
            
        }
        System.out.println(inverte);
    
    }
}
