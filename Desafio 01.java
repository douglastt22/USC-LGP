package Aula04;
import java.util.Scanner;

public class Desafio01 { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		
		System.out.print("Digite o seu batimento cardiaco: ");
		int bpm = scanner.nextInt();
		
		if (idade >= 60 && bpm >= 150){
			
			System.out.println("SUA CLASSIFICAÇÃO É URGENTE");
		} 
		else if (idade >= 60 && bpm <= 150){
			
		System.out.println("Sua classificação é Urgencia Moderada");	}
		
		else if (idade <= 60 && bpm > 150) {
			System.out.println("Sua classificação é Urgencia Moderada");
		}
		
		else if (idade <= 60 && bpm <= 150) {
			System.out.println("Sua classificação é Não Urgente");
		 
		}
		
		scanner.close();
		
	//        22/03/2024  
	}
	

}
