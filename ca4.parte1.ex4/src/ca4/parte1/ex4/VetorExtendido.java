/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca4.parte1.ex4;

/**
 *
 * @author gcres
 */
public class VetorExtendido extends Vetor {
    
    private int primeiroElemento(){
        return this.elementos[0];
    }
    
    private int ultimoElemento(){
        return this.elementos[numElementos];
    }
    
    private int somaElementos(){
        int soma = 0;
        for(int i =0 ; i< this.numElementos; i++){
            soma = soma + this.elementos[i];
        }
        
        return soma;
    }
    
    private int mediaElementos(){
        int soma = 0;
        for(int i =0 ; i< this.numElementos; i++){
            soma = soma + this.elementos[i];
        }
        
        return soma/numElementos;
    }
    
    private boolean pertence(int elemento){
        for(int i =0 ; i< this.numElementos; i++){
            if(this.elementos[i] == elemento) return true;
        }
        
        return false;
    }
    
}
