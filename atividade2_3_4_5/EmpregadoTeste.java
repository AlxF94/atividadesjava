package atividade2_3_4_5;
import javax.swing.JOptionPane;
public class EmpregadoTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Empregado e= new Empregado();
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo");
        String idade = JOptionPane.showInputDialog("Digite a sua idade");
        String altura = JOptionPane.showInputDialog("Digite a sua altura");
        String salario = JOptionPane.showInputDialog("Digite o seu salario");
        
        
        e.setSalario(Double.parseDouble(salario));
        p.setAltura(Float.parseFloat(altura));
        p.setIdade(Integer.parseInt(idade));
        p.setNome(nome);
        p.setSexo(sexo);
        JOptionPane.showMessageDialog(null,"Altura:"+p.getAltura());
        JOptionPane.showMessageDialog(null,"Idade:"+p.getIdade());
        JOptionPane.showMessageDialog(null,"Sexo:"+p.getSexo());
        JOptionPane.showMessageDialog(null,"Lucro:"+e.obterLucros());
        
        
        
    }
    
}