
import java.util.ArrayList;
import javax.swing.*;

public class AppBloco {
    
    private void addNota(ArrayList<String> notas,String nota){
        notas.add(nota);        
    }
    
    private void delNota(ArrayList<String> notas, String nota){
        notas.remove(nota);        
    }
    
    public void alterarNota(ArrayList<String> notas,int indice, String novaNota){

        if(indice >= 0 && indice < notas.size()){
            notas.set(indice + 1 , novaNota);
        } 
    }
    
    
    public static void main(String... args){
        String nota;
        ArrayList<String> opcoes;
        opcoes = new ArrayList <String>();
        opcoes.add("1-Adicionar notas\n");
        opcoes.add("2-Remover notas\n");
        opcoes.add("3-Alterar notas\n");
        opcoes.add("4-Mostrar notas");
        opcoes.add("5-Sair");
        ArrayList<String> notas;
        notas = new ArrayList <String>();  
        int x = 0;
        
        while(x==0){
            System.out.println(notas);
            JOptionPane.showMessageDialog(null, "opcoes: \n" + opcoes) ;                  
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção"));
            switch(opcao){
                case 1:{
                    nota = JOptionPane.showInputDialog("Nota?");                
                    new AppBloco().addNota(notas,nota);
                    break;
                }   
                
                case 2:{
                    nota= JOptionPane.showInputDialog("Excluir qual?");
                    new AppBloco().delNota(notas,nota);   
                    break;
                }
                
                case 3:{
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("qual posição será substituida"));
                    String notaNova = JOptionPane.showInputDialog("qual nota será acrescentada");
                    new AppBloco().alterarNota(notas, posicao, notaNova);
                    break;
                }
                
                case 4:{
                    JOptionPane.showMessageDialog(null,notas);
                    break;
                }
                
                case 5:{
                    x=1;
                    break;
                }
                                    
            }    
        }
    }    
}
