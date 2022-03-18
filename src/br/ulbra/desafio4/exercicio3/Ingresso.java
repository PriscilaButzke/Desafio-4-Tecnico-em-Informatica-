package br.ulbra.desafio4.exercicio3;

/**
 *
 * @author User
 */
public class Ingresso {
    protected  double valor;
    
    public Ingresso(){   
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double imprimeValor(){
        return this.valor;
    }
}
