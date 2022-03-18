package br.ulbra.desafio4.exercicio4;

/**
 *
 * @author User
 */
public class Velho extends Imovel {
    private double desconto;

    public Velho(double desconto, String endereco, double preco) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public Velho() {
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double imprimirValorVelho(){
        return (this.preco - this.desconto);
    }
}
