/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadrao;


public class XSaladaComOvo extends Comida {
    
    public XSaladaComOvo(){
        descricao = "X-salada, com ovo";
    }
 
    @Override
    public double getPreco() {
        return 13.0;
    }
    
}
