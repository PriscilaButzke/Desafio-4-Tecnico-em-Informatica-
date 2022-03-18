package br.ulbra.desafio4.exercicio1;

/**
 *
 * @author User
 */
public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public String exibeDados(){
        return ("Gerente"
               +"\n Nome: " + nome  
               + "\n CPF: " + cpf 
               + "\n Salário: " + salario); 
    }  
    
 
    
}
