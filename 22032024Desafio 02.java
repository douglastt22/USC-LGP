package Aula04;
import java.util.Scanner;

public class Desafio02 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Digite sua altura em metros:");
	     double altura = scanner.nextDouble();

	     System.out.println("Digite seu sexo (m para masculino e f para feminino):");
	     char sexo = scanner.next().charAt(0);

	     double pesoIdeal = 0;

	     if (sexo == 'm') {
	         pesoIdeal = (72.7 * altura) - 58;
	     } else if (sexo == 'f') {
	         pesoIdeal = (62.1 * altura) - 44.7;
	     } else {
	         System.out.println("Sexo não reconhecido.");
	     }

	     if (pesoIdeal != 0) {
	         System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
	     }

	     scanner.close();
	 } //22/03/2024 
	}
