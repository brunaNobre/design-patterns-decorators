/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sempadraoalternativo;


public class Comida {
    
    private boolean ovo;
    private boolean queijoDuplo;
    private boolean bacon;
    
    String descricao = "-";
    
    public String getDescricao() {
        if(ovo && queijoDuplo && bacon) {
            descricao = " com ovo, queijo duplo e bacon";
            return descricao;
        } else if (ovo && queijoDuplo) {
            descricao = " com ovo e queijo";
            return descricao;
        } else if (ovo && bacon) {
            descricao = " com ovo e bacon";
            return descricao;
        } else if (ovo) {
            descricao = " com ovo";
            return descricao;
        } else if(queijoDuplo && bacon) {
            descricao = " com queijo e bacon";
            return descricao;
        } else if (bacon) {
            descricao = " com bacon";
            return descricao;
        } else if (queijoDuplo) {
            descricao = " com queijo";
            return descricao;
        } else {
            return "";
        }
    }
    
    public double getPreco() {
              
        if(ovo && queijoDuplo && bacon) {
            return 3.5;
        } else if (ovo && queijoDuplo) {
            return 1.5;
        } else if (ovo && bacon) {
            return 2.5;
        } else if (ovo) {
            return 0.5;
        } else if(queijoDuplo && bacon) {
            return 3.0;
        } else if (bacon) {
            return 2.0;
        } else if (queijoDuplo) {
            return 1.0;
        } else {
            return 0;
        }
    }
    

    
     public void comOvo() {
        this.ovo = true;
    }
    
 
    
    public void comQueijoDuplo() {
        this.queijoDuplo = true;
    } 
    

    
    public void comBacon() {
        this.bacon = true;
    }
}
