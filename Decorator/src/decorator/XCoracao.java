/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


public class XCoracao extends Comida {
    
    public XCoracao(){
        descricao = "X-coração";
    }
 
    @Override
    public double getPreco() {
        return 14.0;
    }
    
}
