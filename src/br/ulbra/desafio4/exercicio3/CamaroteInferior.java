package br.ulbra.desafio4.exercicio3;

/**
 *
 * @author User
 */
public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteInferior(String localizacao, double valorAdicional, double valor) {
        super(valorAdicional, valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprimirLocal(){
        System.out.println("A localição do ingresso é: " +this.localizacao);
    }   
}
