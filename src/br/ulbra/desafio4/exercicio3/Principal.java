package br.ulbra.desafio4.exercicio3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    
    Ingresso ingresso =new Ingresso(10);
    Normal normal = new Normal();
    Vip vip =new Vip(5,10);
    CamaroteSuperior superior = new CamaroteSuperior(10, vip.getValorAdicional(), ingresso.getValor());
    CamaroteInferior inferior = new CamaroteInferior("", vip.getValorAdicional(), ingresso.getValor());
    
    /* Valores: 
    Ingresso Normal 10,00
    Vip: Camarote Superior 20,00
    Camarote Inferior 15,00
    */
    
    System.out.println("Informe qual tipo de ingresso, digite: "
                      + "\n 1 para ingresso Normal."
                      + "\n 2 para ingresso VIP.");
    
    int opcao = ler.nextInt();
	switch (opcao) {
        case 1:
            System.out.print( normal.Normal());
            break;
		
        case 2:
           System.out.print("Ingresso selecinado: \n Vip");
                System.out.print("\n Digite 1 para Camarote superior ou 2 para Camarote Inferior.");
                int tipoCamarote = ler.nextInt();
                switch (tipoCamarote){
                        case 1:
                        System.out.print("\nIngresso selecinado: \n Camarote Superior \n" 
                                        + superior.valorSuperior());    
                         break;
                         
                        case 2: 
                        System.out.print("\nIngresso selecinado: \n Camarote Inferior."    
                                        + vip.valorVip());
                        break;
                       
                }
            }    
    }
    
            
    
}
