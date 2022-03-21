package listinha;

import java.util.Scanner;

public class questao4lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		float numPrimeiro = 0;
		float numSegundo = 0;
		float numMaior;
		
		System.out.println("informe o primeiro número por favor:");
		numPrimeiro = entrada.nextFloat();
		
		System.out.println("informe o segundo número por favor:");
		numSegundo = entrada.nextFloat(); 
		
		if (numPrimeiro > numSegundo)
			numMaior = numPrimeiro;
		else
			numMaior = numSegundo;
		
		
		System.out.printf("o número maior é: %.2f " , numMaior);

	}

}
