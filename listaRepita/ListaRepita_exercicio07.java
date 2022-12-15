package listaRepita;

public class ListaRepita_exercicio07 {

	public static void main(String[] args) {
		int numero = 1;
		float fatorial = 1;

		
		do {
			fatorial = 1;
			for (int i = numero; i > 0; i--) {
			    fatorial *= i;
			  }
			numero += 2;
			System.out.println(fatorial);
		} while (numero <= 10);
	   }
	}



