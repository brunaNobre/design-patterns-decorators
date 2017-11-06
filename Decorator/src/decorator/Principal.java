/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        new Lancheria().menu();

        //Comida comida = new XCoracao();

        //comida = new QueijoDuplo(comida);

        //comida = new Bacon(comida);

      

        //System.out.println(comida.getDescricao() + " - " + comida.getPreco());
    }

}
