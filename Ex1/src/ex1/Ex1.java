/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author 082170008
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in);
        String nome;
        String endereco;
        String telefone;
        
        System.out.println("Qual seu nome ?");
        nome = le.nextLine();
        
        System.out.println("Qual seu endereço?");
        endereco = le.nextLine();
        
        System.out.println("Qual seu telefone?");
        telefone = le.nextLine();
        
        System.out.println("nome: " +  nome + "\n" + "endereço: " + endereco + "\n" + "telefone" + telefone);
        
    }
    
}
