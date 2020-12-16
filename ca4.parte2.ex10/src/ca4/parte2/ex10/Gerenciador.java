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
public class Gerenciador {
    
    int numeroLinhas = 0;
    Linha Linhas[] = new Linha[100];
    
    public void inserirLinha(char tipo, int tamanho, String cor){       
        switch(tipo){
            case '_':
                Continua linhaContinua = new Continua(tamanho);
                linhaContinua.setCor(cor);
                Linhas[numeroLinhas] = linhaContinua;
                this.numeroLinhas++;
            break;
            case '.' :
                Pontilhada linhaPontilhada = new Pontilhada(tamanho);
                linhaPontilhada.setCor(cor);
                Linhas[numeroLinhas] = linhaPontilhada;
                this.numeroLinhas++;
            break;
            case '-' :
                Tracejada linhaTracejada = new Tracejada(tamanho);
                linhaTracejada.setCor(cor);
                Linhas[numeroLinhas] = linhaTracejada;
                this.numeroLinhas++;
            break;
        }
    }
    
    public void pintarLinhas(String cor){
        for(int i =0; i<numeroLinhas; i++){
            Linhas[i].cor = cor;
        }
    }
    
    public void desenharLinhas(){
        for(int i =0; i<numeroLinhas; i++){
            Linhas[i].desenha();
            System.out.println(' ');
        }
    }
    
}
