package listinha;

import java.util.Scanner;

public class questao2lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float peso = 0;
		float altura = 0;
		float imc;
		
		System.out.println("informe seu peso por favor:");
		peso = entrada.nextFloat();
		
		System.out.println("informe sua altura por favor:");
		
		altura = entrada.nextFloat();
		imc = peso / altura;
		
		System.out.printf("o valor od seu imc é: %.2f" , imc);

	}

}
