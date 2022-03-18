package br.ulbra.desafio4.exercicio2;

/**
 *
 * @author Priscila Butzke
 */
public class Pobre extends Pessoa {

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    public String trabalha(){
        return "Trabalhar";
    }
    
    @Override
    public String toString() {
        return  "Pobre: "
                + "\n Nome: " + this.nome
                + " \n Ação: " + trabalha();
    }
    
}
