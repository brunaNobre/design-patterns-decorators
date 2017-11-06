/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadrao;


public class XSaladaComBacon extends Comida {
    
    public XSaladaComBacon(){
        descricao = "X-salada, com bacon";
    }
 
    @Override
    public double getPreco() {
        return 14.0;
    }
    
}
