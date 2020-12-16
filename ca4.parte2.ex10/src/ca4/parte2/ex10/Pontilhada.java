/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca4.parte2.ex10;
import ca4.parte2.ex10.Linha;
/**
 *
 * @author gcres
 */
public class Pontilhada extends Linha {
    
    Pontilhada(int tamanho){
        this.tamanho = tamanho;
    }
    
    void desenha(){
        for(int i = 0; i<this.tamanho; i++){
            System.out.print('.');
        }
    }
    
}
