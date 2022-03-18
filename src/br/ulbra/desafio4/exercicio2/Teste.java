package br.ulbra.desafio4.exercicio2;

/**
 *
 * @author Priscila Butzke
 */
public class Teste {
    public static void main(String[] args) {
     
    // Teste exercicio 5.c   
    Rica rica = new Rica(10300, "Ramon", 32);
    Pobre pobre = new Pobre("Maria", 45);
    Miseravel miseravel = new Miseravel("João", 57);
    
        System.out.println(rica.toString());
        System.out.println(pobre.toString());
        System.out.println(miseravel.toString());    
    }
}
