/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author dimpa
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //A través del objeto entrada podemos guardar los datos que queramos
        
        int numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        //Se guarda un número
        
        System.out.println("El numero es: " + numero);
        
    }
    
}
