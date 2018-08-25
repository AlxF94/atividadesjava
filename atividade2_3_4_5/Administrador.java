
package atividade2_3_4_5;
public class Administrador extends Empregado{
    private double ajudasDeCusto;
    @Override
        public double obterLucros(){
            return (getSalario() + getAjudasDeCusto());
        }

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }


        
    
}