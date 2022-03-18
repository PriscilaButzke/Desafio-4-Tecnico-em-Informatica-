package br.ulbra.desafio4.exercicio4;

/**
 *
 * @author User
 */
public class Imovel {
    protected String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public Imovel(){
  
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String imprimirImovel(){
        return "Endereço: " + this.endereco
               + "\nPreço: R$ " +this.preco;
        
    }
}
