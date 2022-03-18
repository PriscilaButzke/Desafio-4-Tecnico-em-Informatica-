package br.ulbra.desafio4.exercicio2;

/**
 *
 * @author User
 */
public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(double dinheiro, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public String fazCompras(){
        return "Fazer compras";
            
    }

    @Override
    public String toString() {
        return  "Rica: "
                + "\n Nome: " + this.nome
                + "\n Dinheiro: " + dinheiro 
                + " \n Ação: " + fazCompras();

    }    
}
