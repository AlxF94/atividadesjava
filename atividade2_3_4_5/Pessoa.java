package atividade2_3_4_5;

public class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float altura;

    
        public void setNome(String n){
            this.nome=n;
        }
        public void setSexo(String s){
            this.sexo=s;
        }
        public void setIdade(int i){
            this.idade=i;
        }
        public void setAltura(float a){
            this.altura=a;
        }
        public String getNome(){
            return this.nome;
        }
        public String getSexo(){
            return this.nome;
        }
        public int getIdade(){
            return this.idade;
        }
        public float getAltura(){
            return this.altura;
        }
        public Pessoa(){
        
        }
        public Pessoa(String n, String s, int i, float a){
            setAltura(a);
            setIdade(i);
            setNome(n);
            setSexo(s); 
        }

        
        
}
