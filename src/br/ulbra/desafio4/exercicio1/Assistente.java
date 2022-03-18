package br.ulbra.desafio4.exercicio1;

/**
 *
 * @author User
 */
public class Assistente extends Funcionario{
    
    private int matricula;

    public Assistente() {
    }

    public Assistente(int matricula,String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.matricula = matricula;
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    public String exibeDados(){
        return("Assistente"
              +"\n Nome: " + nome  
              + "\n CPF: " + cpf 
              + "\n Salário: " + salario 
              + "\n Matrícula: " + matricula);
    }  
}
