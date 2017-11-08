/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadraoalternativo;

/**
 *
 * @author android
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Comida xSalada = new XSalada();
        Comida bauru = new Bauru();
        bauru.comBacon();
        bauru.comOvo();
        
       
        
        System.out.println(xSalada.getDescricao()+ " - " + xSalada.getPreco());
        System.out.println(bauru.getDescricao()+ " - " + bauru.getPreco());
    }
    
}
