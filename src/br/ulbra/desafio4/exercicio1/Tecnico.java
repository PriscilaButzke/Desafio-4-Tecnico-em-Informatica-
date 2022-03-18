package br.ulbra.desafio4.exercicio1;

/**
 *
 * @author User
 */
public class Tecnico extends Assistente {
    private double bonus;

   public Tecnico(double bonus) {
        this.bonus = bonus;
    }

    public Tecnico(double bonus, int matricula, String nome, String cpf, double salario) {
        super(matricula, nome, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double bonusSalarial(){
        
        double bonusSalarial =0; 
        bonusSalarial =  salario + this.bonus; 
        return bonusSalarial; 
    }
    
    public String exibeDados(){
        return ("Assistente Técnico" 
                          + "\n Nome: " + nome  
                          //+ "\n CPF: " + cpf 
                          //+ "\n Salário: R$ " + salario
                          //+ "\n Bônus: R$ " +this.bonus
                          //+ "\n Salário Total: R$ "  + bonusSalarial());
                          +"\n Número de Matricula: " +this.getMatricula());
    }            
}
 
    

