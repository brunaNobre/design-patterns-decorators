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
public class XSaladaComOvoEBaconEQueijoDuplo extends Comida{
    
    public XSaladaComOvoEBaconEQueijoDuplo(){
        descricao = "X-salada, com ovo, com bacon, com queijo duplo";
    }
 
    @Override
    public double getPreco() {
        return 15.5;
    }
}
