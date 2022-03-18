package br.ulbra.desafio4.exercicio22;
/**
 *
 * @author User
 */
public class Animal {
    protected String nome;
    protected String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    
    public void animal(){
   
    }
    
    public String animal(String nome){
        return "";
    }
    
    public String caminha(){
        return " caminhando";
    }
    
    
}
