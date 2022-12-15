package listaRepita;

public class ListaRepita_exercicio04 {

	public static void main(String[] args) {
		float i = 1;
		float acrescimo = 0;
	
		do {
			System.out.println(acrescimo);
			acrescimo = (acrescimo + acrescimo) + 1; 
			i++;
		} while (i<63);
	}
}
