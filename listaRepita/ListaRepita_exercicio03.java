package listaRepita;

public class ListaRepita_exercicio03 {

	public static void main(String[] args) {
		
		int numero = 1;
		do {
			if (numero % 4 == 0) {
				System.out.println(numero + " é divisivel por 4");
			}
			numero++;
		} while (numero<=200);

	}

}
