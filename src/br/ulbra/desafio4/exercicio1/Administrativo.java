package br.ulbra.desafio4.exercicio1;

/**
 *
 * @author User
 */
public class Administrativo extends Assistente{
    private String turno;
    private double adicional;
    
    public Administrativo(String turno, double adicional) {
        this.turno = turno;
        this.adicional = adicional;
    }

    public Administrativo(String turno, double adicional, int matricula, String nome, String cpf, double salario) {
        super(matricula, nome, cpf, salario);
        this.turno = turno;
        this.adicional = adicional;
        

    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno.toUpperCase();
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }


    public String adicionalNoturno(){
        
        if(turno.equals ("DIURNO")){
            return "Sem direito a adicional. \n Salário: " + salario;
            
        } else{ 
            turno.equals ("NOTURNO");
            return "" + (salario + this.adicional);
        }
    }  
    
    public String exibeDados(){
        return("Assistente Administrativo"
                          +"\nNome: " + this.nome  
                          //+ "\n CPF: " + this.cpf 
                          +"\n Matricula: " + this.getMatricula());
                          //+ "\n Turno: " + this.turno
                          //+ "\n Salário: R$ " + salario
                          //+"\n Adicional: R$ "  + this.adicional
                          //+ "\n Salário total: R$ " + adicionalNoturno()); 
    }
}
