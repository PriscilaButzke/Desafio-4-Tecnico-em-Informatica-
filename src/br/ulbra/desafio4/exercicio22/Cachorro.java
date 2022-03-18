package br.ulbra.desafio4.exercicio22;
/**
 *
 * @author Priscila Butzke
 */
public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    
    public String late(){
        return "Au-Au";
    }  
}
