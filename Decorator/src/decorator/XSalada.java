/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


public class XSalada extends Comida {
    
    public XSalada(){
        descricao = "X-salada";
    }
 
    @Override
    public double getPreco() {
        return 12.0;
    }
    
}
