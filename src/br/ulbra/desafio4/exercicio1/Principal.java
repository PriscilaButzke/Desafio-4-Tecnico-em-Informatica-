package br.ulbra.desafio4.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Principal {
    public static void main(String[] args) {
    
        
    // Teste Exercicio 5.a   
    Funcionario f = new Funcionario();
    Administrativo adm = new Administrativo("", 0, 4503, " Paulo", "", 0);
    Tecnico tec = new Tecnico(0, 33839, "Pamela", "", 0);
    
        System.out.println(adm.exibeDados());
        System.out.println(tec.exibeDados());
         
    /* Teste Total:
        
    Obs.Para o teste total ser executado, as funções de exibeDados devem ser alteradas para apresentar as demais informações,
        que foram transformadas em comentátios.
        
    Funcionario f = new Funcionario();
    Gerente g = new Gerente("João", "084434939", 4000); //nome, cpf,salario
    
    Assistente a = new Assistente(560," Maria", "437483", 2500);
                                    //matricula,nome, cpf, salario
    
    Administrativo adm = new Administrativo("Noturno", 400, 4560, "Maria", "624728492", 3000.00);
                           //turno: Diurno ou Noturno,adicional,matricula, nome, cpf, salario
    
    Tecnico t = new Tecnico(500, 8483249, "Gustavo", "5567789", 3000);//nome, cpf,salario
        
    Scanner ler = new Scanner(System.in);
        
    System.out.println(g.exibeDados());
    System.out.println(a.exibeDados());
    System.out.println(adm.exibeDados());
    System.out.println(t.exibeDados());*/
    
    }
    
    
}
