package listaRepita;

import java.util.Scanner;

public class ListaRepita_exercicio06 {

	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int quantNumeros = 0;
	int soma = 0;
	float media = 0;
	int numero;
	do {
		System.out.println("================================");
		System.out.println("Quantidade de números inseridos: " + quantNumeros);
		System.out.println("Por favor, Digite um número:");
		numero = sc.nextInt();
		soma += numero;
		quantNumeros++;
	} while (numero > 0);
	
	soma -= numero;
	media = soma / quantNumeros;
	
	System.out.println(quantNumeros + " foram inseridos. A soma deles é de: " + soma);
	System.out.println("A média dos valores é igual a: " + media);
	
	}

}
