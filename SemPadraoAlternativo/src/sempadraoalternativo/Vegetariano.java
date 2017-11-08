/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadraoalternativo;

/**
 *
 * @author android
 */
public class Vegetariano extends Comida {

    public Vegetariano() {
        descricao = "Vegetariano";
    }

    @Override
    public String getDescricao() {
        return descricao + (super.getDescricao());
    }

    @Override
    public double getPreco() {
        return 15.0 + (super.getPreco());
    }
}
