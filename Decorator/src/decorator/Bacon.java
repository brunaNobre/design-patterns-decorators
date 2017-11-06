/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


public class Bacon extends Acompanhamento{
    
    public Bacon(Comida comida) {
        super(comida);
    }
    
    @Override
    public String getDescricao() {
        return comida.getDescricao()+", com bacon";
    }
    
     @Override
    public double getPreco() {
      return comida.getPreco() + 2.0;
  }
    
}
