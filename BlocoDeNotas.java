/*a) Crie a classe BlocoDeNotas que possui como atributo um ArrayList<String>
chamado notas. Crie métodos para inserir, remover e buscar notas. Crie um método
que imprima todas as notas.*/
package com.joao.aula07;

import java.util.ArrayList;
import javax.swing.*;



public class BlocoDeNotas {
      
    private void AddNota(ArrayList<String> notas,String nota){
        notas.add(nota);        
    }
    
    private void DelNota(ArrayList<String> notas, String nota){
        notas.remove(nota);        
    }
    
    private int BuscaNota(ArrayList<String> notas, String nota){
        for(int i=0; i < notas.size(); i++){
            if(notas.get(i).equals(nota)){
                return i;
            }
        }
        return -1;        
    }
    
    public static void main(String... args){
        
        String nota;
        ArrayList<String> opcoes;
        opcoes = new ArrayList <String>();
        opcoes.add("1-Adicionar notas\n");
        opcoes.add("2-Remover notas\n");
        opcoes.add("3-Buscar notas\n");
        opcoes.add("4-Sair");
        ArrayList<String> notas;
        notas = new ArrayList <String>();
        
        int x=0;
       
        while(x==0){
            JOptionPane.showMessageDialog(null, "opcoes: \n" + opcoes + "\nsuas notas\n" + notas);
                    
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção"));
        
            switch(opcao){
                case 1:{
                    nota = JOptionPane.showInputDialog("Nota?");                
                    new BlocoDeNotas().AddNota(notas,nota);
                    break;
                }
                
                case 2:{
                    nota= JOptionPane.showInputDialog("Excluir qual?");
                    new BlocoDeNotas().DelNota(notas,nota);   
                    break;
                }
                case 3:{
                    nota=JOptionPane.showInputDialog("Pesquisar qual?");
                    int posicao = new BlocoDeNotas().BuscaNota(notas,nota);
                    JOptionPane.showMessageDialog(null,"posição" + posicao);
                    break;
                }
                
                case 4:{
                    x=1;
                    break;
                }
            }        
        }           
    
    } 
    
    
}
    
   
