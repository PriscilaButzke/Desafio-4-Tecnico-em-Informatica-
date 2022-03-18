package br.ulbra.desafio4.exercicio3;

/**
 *
 * @author Priscila Butzke
 */
public class Vip extends Ingresso{
    protected double valorAdicional;

    public Vip() {
    }
    

    public Vip(double valorAdicional, double valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String valorVip(){
        return "Valor: R$ " +(this.valor + this.valorAdicional);
    }
        
}
