
package atividade.pkg2;

import javax.swing.JOptionPane;
public class Teste {
    public static void main(String[] args) {
        Animal X = new Animal();
        Cachorro L = new Cachorro();
        Cocker Z = new Cocker();
        String tipo = JOptionPane.showInputDialog("Qual o tipo do animal?");
        String cor = JOptionPane.showInputDialog("Qual a cor do animal?");
        String nome = JOptionPane.showInputDialog("Qual o nome do cachorro?");
        String raca = JOptionPane.showInputDialog("Qual a raça do cachorro?");
        String tosa = JOptionPane.showInputDialog("Ele precisa de tosa?");
        X.setTipo(tipo);
        X.setCor(cor);
        L.setNome(nome);
        L.setRaca(raca);
        if (tosa=="nao"){
            Z.setTosa(true);
       }
        else {
            Z.setTosa(false);
        }
        JOptionPane.showMessageDialog(null,""+X.toString()+"");
        JOptionPane.showMessageDialog(null,""+L.toString()+"");
        JOptionPane.showMessageDialog(null,""+Z.precisaTosa());
       
    }
}
