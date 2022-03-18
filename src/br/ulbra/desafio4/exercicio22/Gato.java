package br.ulbra.desafio4.exercicio22;

/**
 *
 * @author Priscila Butzke
 */
public class Gato extends Animal{
    
    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    
    public String mia(){
        return "Miau-Miau"; 
    }        
}
