package listaRepita;

import java.util.Scanner;

public class ListaRepita_exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int maiorNumero = 0;
		int menorNumero = 0;
		do {
			System.out.println("Digite um valor:");
			int numero = sc.nextInt();
			
			if (numero > maiorNumero){
			maiorNumero = numero;
			}
			 else {
				menorNumero = numero; 
			 }
			i = numero;
		} while (i > 0);
		System.out.println("O maior n�mero � " + maiorNumero);
		System.out.println("O menor n�mero � " + menorNumero);
	}
}
		
