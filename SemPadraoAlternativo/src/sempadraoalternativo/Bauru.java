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
public class Bauru extends Comida {

    public Bauru() {
        descricao = "Bauru";
    }

    @Override
    public String getDescricao() {
        return descricao + (super.getDescricao());
    }

    @Override
    public double getPreco() {
        return 18.0 + (super.getPreco());
    }
}
