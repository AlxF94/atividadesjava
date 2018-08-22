
package atividade_aula3;

import javax.swing.JOptionPane;

public class Atividade_aula3 {

public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        if(idade>=18){
            
            JOptionPane.showMessageDialog(null,""+nome+" Você já pode tirar seu CNH");
        }
        else{
            JOptionPane.showMessageDialog(null,""+nome+" Você ainda não pode tirar a CNH, você tem apenas"+idade+" anos");
        }
        
    }
    
}
