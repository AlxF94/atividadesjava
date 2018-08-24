
package atividade.pkg2;

    public class Cachorro extends Animal{
    private String nome, raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Cachorro(){
    }
    public Cachorro(String r,String n){
        setRaca(r);
        setNome(n);
    }

    @Override
   public String toString(){
       return (getRaca()+getNome());

   }     
    
}

