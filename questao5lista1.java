package listinha;

import java.util.Scanner;

public class questao5lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float numero;
		
		System.out.println("informe seu n�mero por favor:");
		numero = entrada.nextFloat();
		
		if (numero %2 == 0)
			System.out.println("seu n�mero escolhido � par");
		else
			System.out.println("seu n�mero � �mpar");
	}

}
