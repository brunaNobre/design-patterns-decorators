/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author aluno
 */
public abstract class Comida {
    
    String descricao = "-";
    
    public String getDescricao() {
        return descricao;
    }
    
    public abstract double getPreco();
}
