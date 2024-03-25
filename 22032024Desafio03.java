package Aula04;
import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        

        System.out.println("Por favor escolha a operação:");
        
        System.out.println("1 = Adição ");
        
        System.out.println("2 = Subtraçao ");
        
        System.out.println("3 = Multiplicação ");
        
        System.out.println("4 = Divisão ");
        
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();
        
        int resultado = 0;
        

        switch(opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Nao pode dividir por zero");
                  
                }
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
        
       
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    } //22/03/2024 
}
