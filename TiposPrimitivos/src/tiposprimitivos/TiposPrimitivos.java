/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Mikael
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota = 0;
        String nome = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: " );
        nome =sc.nextLine();
        System.out.print("Digite a note do aluno: ");
        nota = sc.nextInt();
        System.out.printf("A nota do aluno %s é %d \n", nome , nota);
        
        
    }
    
}
