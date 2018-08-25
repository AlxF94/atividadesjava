package atividade2_3_4_5;
public class Fornecedor extends Pessoa {
    private double creditoMaximo;
    private double valorEmDivida; 

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    public double obterSaldo(double valor){
        valor=creditoMaximo-valorEmDivida;
        return valor;
    }

    public Fornecedor(double CM, double VM) {
        setCreditoMaximo(VM);
        setValorEmDivida(CM);
    }
    public Fornecedor(){
    
    }
    
}
