package listinha;

import java.util.Scanner;

public class questao1lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float primeiraNota = 0;
		float segundaNota = 0;
		float terceiraNota= 0;
		float quartaNota = 0;
		float quintaNota = 0;
		float media;
		
		System.out.println("informe a sua primeira nota por favor:");
		primeiraNota = entrada.nextFloat();
		
		System.out.println("informe a sua segunda nota por favor:");
		segundaNota = entrada.nextFloat();
		
		System.out.println("informe a sua terceira nota por favor:");
		terceiraNota = entrada.nextFloat();
		
		System.out.println("informe a sua quarta nota por favor:");
		quartaNota = entrada.nextFloat();
		
		System.out.println("informe a sua quinta nota por favor:");
		quintaNota = entrada.nextFloat();
		
		media = (primeiraNota + segundaNota + terceiraNota+ quartaNota + quintaNota) / 5;
		System.out.printf("a sua média é: %.2f " , media);


	}

}
