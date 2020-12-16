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
public class Tracejada extends Linha {
    
    Tracejada(int tamanho){
        this.tamanho = tamanho;
    }
    
    void desenha(){
        for(int i = 0; i<this.tamanho; i++){
            System.out.print('-');
            System.out.print(' ');
            i = i+1;
        }
    }
    
}
