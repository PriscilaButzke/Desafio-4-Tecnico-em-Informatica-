package br.ulbra.desafio4.exercicio2;

/**
 *
 * @author Priscila Butzke
 */
public class Miseravel extends Pessoa{

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }
    
    public String mendiga(){
        return"Pedir esmola";
    }
    
    @Override
    public String toString() {
        return  "Miseravel: "
                + "\n Nome: " + this.nome
                + " \n Ação: " + mendiga();
    }
}
