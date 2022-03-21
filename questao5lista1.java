package listinha;

import java.util.Scanner;

public class questao5lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float numero;
		
		System.out.println("informe seu número por favor:");
		numero = entrada.nextFloat();
		
		if (numero %2 == 0)
			System.out.println("seu número escolhido é par");
		else
			System.out.println("seu número é ímpar");
	}

}
