/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


public abstract class Acompanhamento extends Comida{
    
    protected Comida comida;
    
    public Acompanhamento (Comida comida){
        this.comida = comida;
    }
    
    abstract public String getDescricao();
}
