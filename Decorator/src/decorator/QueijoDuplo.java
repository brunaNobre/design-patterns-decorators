/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


public class QueijoDuplo extends Acompanhamento{
    
  public QueijoDuplo(Comida comida) {
      super(comida);
  }
  
  @Override
  public String getDescricao() {
      return comida.getDescricao()+", com queijo duplo";
  }
  
  @Override
  public double getPreco() {
      return comida.getPreco() + 0.5;
  }
}
