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
public class Vetor {
    
    protected int[] elementos;
    protected int numElementos;
    
    Vetor(int elemento, int numElementos){
        this.elementos = new int[numElementos];
        for(int i =0; i< numElementos; i++){
            elementos[i] = elemento;
        }
        this.numElementos = numElementos;
    }
    
    Vetor(){
        this.elementos = new int[100];
        this.numElementos = 0;
    }
    
    public boolean inserir(int elemento){
        if(this.numElementos != 100){
            this.elementos[numElementos] = elemento;
            this.numElementos++;
            return true;
        }
        else return false;
    }
    
    public boolean remover(int elemento){
        for(int i = 0; i< this.numElementos; i++){
            if(this.elementos[i] == elemento) this.elementos[i] = -1;
            return true;
        }
        return false;
    }
    
    public void preencher(int elemento, int nRepeticoes){
        for(int i = 0; i < nRepeticoes; i++){
            if(this.numElementos < 100){
                this.elementos[numElementos] = elemento;
                this.numElementos++;
            }
        }
    }
    
    public int recuperarElemento(int posicao){
        return this.elementos[posicao];
    }
    
    public void imprimir(){
        for(int i = 0; i< this.numElementos; i++){
            System.out.println("Elemento: " + this.elementos[i]);
        }
    }
}
