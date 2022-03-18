package br.ulbra.desafio4.exercicio3;

/**
 *
 * @author User
 */
public class CamaroteSuperior extends Vip{
    private double adicionalSuperior;

    public CamaroteSuperior(){
    }

    public CamaroteSuperior(double adicionalSuperior, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.adicionalSuperior = adicionalSuperior;
    }
    
   
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String valorSuperior(){
        return "Valor: R$ " +(this.valor + this.adicionalSuperior);
    }
    
    
}
