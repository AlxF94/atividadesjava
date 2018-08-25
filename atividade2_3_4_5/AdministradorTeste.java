package atividade2_3_4_5;

import javax.swing.JOptionPane;
public class AdministradorTeste {
        public static void main(String[] args) {
        Administrador a = new Administrador();
        Empregado e = new Empregado();
        Pessoa p = new Pessoa();
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
        String idade = JOptionPane.showInputDialog("Digite a sua idade");
        String altura = JOptionPane.showInputDialog("Digite a sua altura");
        String salario = JOptionPane.showInputDialog("Digite o seu salario:");
        String ajudasDeCusto = JOptionPane.showInputDialog("Digite as suas ajudas de custos:");  
        e.setSalario(Double.parseDouble(salario));
        p.setAltura(Float.parseFloat(altura));
        p.setIdade(Integer.parseInt(idade));
        p.setNome(nome);
        p.setSexo(sexo);        
        a.setSalario(Double.parseDouble(salario));
        a.obterLucros();
        a.setAjudasDeCusto(Double.parseDouble(ajudasDeCusto));
        JOptionPane.showMessageDialog(null,"Altura:"+p.getAltura());
        JOptionPane.showMessageDialog(null,"Idade:"+p.getIdade());
        JOptionPane.showMessageDialog(null,"Sexo:"+p.getSexo());
        JOptionPane.showMessageDialog(null,"Lucro:"+e.obterLucros());
        JOptionPane.showMessageDialog(null,"Valor:"+a.obterLucros() );
        
        
        }
    
}