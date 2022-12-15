package listaRepita;

import java.util.Scanner;

public class ListaRepita_exercicio05 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int i = 1;
		int soma = 0;
		
		do {
			System.out.println("Números digitados (" + i +"/15)" );
			int numero = sc.nextInt();
			soma += numero;
			i++;
		} while (i<16);
		System.out.println("A soma dos 15 números é igual a: " + soma);
	}

}
// soma os 15 valores inseridos pelo usuário e depois exibe o resultado