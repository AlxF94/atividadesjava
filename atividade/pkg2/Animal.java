package atividade.pkg2;
    
   public class Animal {
    protected String cor,tipo;
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Animal(String c,String t){
        setCor(c);
        setTipo(t);
   }
   public Animal(){
   }
    
    @Override
   public String toString(){
       return (getCor()+getTipo());

   } 
}