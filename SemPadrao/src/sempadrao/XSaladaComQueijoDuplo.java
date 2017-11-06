/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadrao;

/**
 *
 * @author android
 */
public class XSaladaComQueijoDuplo extends Comida{
    
        public XSaladaComQueijoDuplo(){
        descricao = "X-salada, com queijo duplo";
    }
 
    @Override
    public double getPreco() {
        return 12.5;
    }
}
