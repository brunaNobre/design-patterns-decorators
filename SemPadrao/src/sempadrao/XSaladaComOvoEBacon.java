/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadrao;


public class XSaladaComOvoEBacon extends Comida {
    
    public XSaladaComOvoEBacon(){
        descricao = "X-salada, com ovo, com bacon";
    }
 
    @Override
    public double getPreco() {
        return 15.0;
    }
    
}
