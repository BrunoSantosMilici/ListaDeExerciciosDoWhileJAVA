package listaRepita;

import java.util.Scanner;

public class ListaRepita_exercicio08 {

	public static void main(String[] args) {
		float areaTotal = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite o nome do c�modo:");
		String nome = sc.next();
		
		System.out.println("Digite a largura do c�modo:");
		float largura = sc.nextFloat();
		
		System.out.println("Digite o comprimento do c�modo:");
		float comprimento = sc.nextFloat();
		
		float area = largura * comprimento;
		System.out.println("A �rea desse c�modo � de " + area + "m�");
		areaTotal += area;
		System.out.println("=========================================");
		System.out.println("Voc� deseja continuar? (SIM OU N�O)");
		String i = sc.next();
		if (i.equals("N�O")) {
			break;
			}
		} while (true);
		System.out.println("A �rea total � de " + areaTotal +"m�");
		}
		
	}
