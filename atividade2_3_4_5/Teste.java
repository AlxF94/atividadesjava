
package atividade2_3_4_5;

import javax.swing.JOptionPane;
public class Teste {
        public static void main(String Args[]){
        Pessoa p = new Pessoa();
        Empregado e = new Empregado();
        Vendedor v = new Vendedor();
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
        String idade = JOptionPane.showInputDialog("Digite a sua idade");
        String altura = JOptionPane.showInputDialog("Digite a sua altura");
        String vendas = JOptionPane.showInputDialog("Digite o valor das vendas:");
        String comissao = JOptionPane.showInputDialog("Digite a comissão:");
        p.setNome(nome);
        p.setSexo(sexo); 
        p.setIdade(Integer.parseInt(idade));
        p.setAltura(Float.parseFloat(altura));
        v.setValorVendas(Double.parseDouble(vendas));
        v.setComissao(Double.parseDouble(comissao));
        JOptionPane.showMessageDialog(null, "Lucro: " + v.obterLucros());
            
            
            

        }
        