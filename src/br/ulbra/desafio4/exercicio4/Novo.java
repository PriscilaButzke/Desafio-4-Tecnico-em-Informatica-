package br.ulbra.desafio4.exercicio4;

/**
 *
 * @author User
 */
public class Novo extends Imovel{
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional=adicional;
    }

    public Novo() {
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public double imprimirValorNovo(){
        return (this.adicional + this.preco);
    }
    
}
