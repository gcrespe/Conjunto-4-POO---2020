/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca4.parte2.ex6;

/**
 *
 * @author gcres
 */
public class ListaOrdenada extends Lista {
    
    
   @Override
   void insere(int elemento){
        No novo = new No(elemento);
        
        if(elemento <= inicio.valor){
            novo.prox = inicio;
            inicio = novo;
        }
        else{
            No aux = inicio;
            while(elemento > aux.prox.valor){
                aux = aux.prox;
            }
            novo.prox = aux.prox;
            aux.prox = novo;
        }
        
   }
   
   int localiza(int elemento){
       int posicao = 0;
       if(elemento != inicio.valor){
           No aux = inicio;
           while(elemento != aux.valor){
               aux = aux.prox;
               posicao++;
           }
           if(elemento == aux.valor){
               return posicao;
           }
       }else if(elemento == inicio.valor) return 0;
      
       return -1;
       
   }
}
