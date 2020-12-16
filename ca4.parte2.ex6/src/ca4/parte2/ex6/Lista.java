/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca4.parte2.ex6;
import ca4.parte2.ex6.No;

/**
 *
 * @author gcres
 */
public class Lista {

    public No inicio;
    
    public Lista(){
       inicio = null;
    }
    
    public boolean vazia(){
        return this.inicio == null;
    }
    
    void insere(int elemento){
        No novo = new No(elemento);
        
        novo.prox = inicio;
        inicio = novo;
        
    }
    
    int removeInicio(){
        No aux = inicio;
        inicio = inicio.prox;
        return aux.valor;
    }
    
    int removeFim(){
        
        No aux = inicio;
        
        if(aux != null){
            while(aux != null){
                if(aux.prox != null) aux = aux.prox;
            }
        }
        
        int valor = aux.valor; 
        aux = null;
        return valor;
    }
    
    int localiza(int elemento){
        int posicao = 0;
        if(inicio != null){
            No no = inicio;
            while(no != null){
                if(no.valor == elemento){
                    return posicao;
                }
                posicao++;
                no = no.prox;
            }
        }
        return -1;
    }
    
    void mostrar(){
        No aux = inicio;
        if(!vazia()){
            while(aux != null){
                System.out.print(" " + aux.valor);
                if(aux.prox != null) aux = aux.prox;
            }
        }
    }
    
}
