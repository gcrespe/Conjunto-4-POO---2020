/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca4.parte2.ex10;

/**
 *
 * @author gcres
 */
public abstract class Linha {

    public int tamanho;
    public String cor;
    
    void setCor(String cor){
        this.cor = cor;
    }
    
    abstract void desenha();
    
}
