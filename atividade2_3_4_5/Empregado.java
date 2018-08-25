
package atividade2_3_4_5;
public class Empregado extends Pessoa{
    protected double salario;
    
        public void setSalario(double s){
            this.salario=s;
        }
        public double getSalario(){
            return this.salario;
        }
        public double obterLucros(){
            return this.salario;
        }
        public Empregado(){
    
        }
        public Empregado(double s){
            setSalario(s);
        }

 
    
}
