package listaRepita;

public class ListaRepita_exercicios02 {

	public static void main(String[] args) {
		int numero = 1;
		int resultado = 0;
		
		do {
			if (numero % 2 == 0) {
				resultado += numero;
			} 
			numero++;
		} while (numero<=500);
		
		System.out.println("O resultado é: " + resultado);
	}

}
// Algoritmo que serve para apresentar no final o somatório dos valores pares existentes na faixa de 1 até 500. 