package br.ulbra.desafio4.exercicio22;

/**
 *
 * @author Priscila Butzke
 */
public class Teste {
    public static void main(String[] args) {
        
        //Teste exercicio 5.b
        Animal animal = new Animal("", "");
        Cachorro cachorro = new Cachorro("Cachorro", "");
        Gato gato = new Gato("Gato", "");
        
        System.out.println(cachorro.late());
        System.out.println(gato.mia());
        System.out.println(cachorro.nome +cachorro.caminha());
        System.out.println(gato.nome +gato.caminha()); 
    }
    
}
