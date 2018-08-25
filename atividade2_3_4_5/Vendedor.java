package atividade2_3_4_5;
public class Vendedor extends Empregado{
    private double valorVendas, comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double obterLucros(){
        return getSalario() + (getValorVendas() * (getComissao() / 100));
    }
    
}
