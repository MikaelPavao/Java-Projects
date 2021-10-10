/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Mikael
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 12;
        int b = 23;
        int c = 45;
        boolean res;
        
        boolean teste = a<b != b<c?true:false;
        System.out.println(teste);
    }
    
}
