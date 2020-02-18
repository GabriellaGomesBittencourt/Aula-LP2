/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author 082170008
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String comando = "";
        String texto = "";
        String caracterAntigo ="";
        String caracterNovo ="";
        Scanner le = new Scanner(System.in);
        while(comando != "S"){
        System.out.print("Escolha uma opção: \n" 
                + "U - Retorna última letra \n"
                + "T - Substitui pelo novo caracter \n"
                + "I - Retorna as iniciais \n"
                + "S - Sair ");
        comando = le.nextLine();
        
            if("U".equals(comando.toUpperCase())){
                System.out.println("Digite o texto:");
                texto = le.nextLine();
                UltimaLetra(texto);
            }
            else if("T".equals(comando.toUpperCase())){
                System.out.println("Digite o texto:");
                texto = le.nextLine();
                System.out.println("Digite o caracter original:");
                caracterAntigo = le.nextLine();
                System.out.println("Digite o novo caracter:");
                caracterNovo = le.nextLine();
                TrocaLetra(texto, caracterAntigo, caracterNovo );
                
            }
        }
    }
    public static void  UltimaLetra(String texto)
    {
        String Ultima = texto.trim().substring(texto.length() - 1);
        System.out.println("Última letra do seu texto foi:" + Ultima);
    }
    public static void TrocaLetra(String texto, String cA, String cN){
        String Nova = texto.replace(cA, cN);
        System.out.println("Novo texto:" + Nova);
    
    }
    
    
}
