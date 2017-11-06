/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
 public class Util {
    static Scanner in = new Scanner(System.in);
    
    
    public static int leInt() {
        return in.nextInt();
        
    }
    
    public static String leString() {
        in.nextLine();
        return in.nextLine();
    }
    
}
