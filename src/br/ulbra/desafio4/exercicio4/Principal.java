package br.ulbra.desafio4.exercicio4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in); 
    
    Imovel imovel = new Imovel("Copacabana", 200);
    Novo novo = new Novo(imovel.getEndereco(), imovel.getPreco(), 100);
    Velho velho = new Velho(50, imovel.getEndereco(), imovel.getPreco());
    
    /* Valores:
    Imovel : 200
    Adicional novo: 100
    Desconto Velho: 50
    */
    
    System.out.println("Informe qual imóvel deseja, digite: "
                      + "\n 1 para imóvel Novo."
                      + "\n 2 para imóvel Velho.");
    
    int opcao = ler.nextInt();
	switch (opcao) {
        case 1:
            System.out.print("Valor Imóvel novo: "
                             + novo.imprimirValorNovo());
            break;
		
        case 2:
            System.out.println("Valor imóvel velho: "
                               +velho.imprimirValorVelho());
        }
    }   
}
