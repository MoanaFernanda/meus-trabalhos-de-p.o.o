package listinha;

import java.util.Scanner;

public class questao3lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float baseMaior = 0;
		float baseMenor = 0;
		float altura = 0;
		float area;
		
		System.out.println("informe o valor da base maior por favor:");
		baseMaior = entrada.nextFloat();
		
		System.out.println("informe o valor da base menor por favor");
		baseMenor = entrada.nextFloat();
		
		System.out.println("informe sua altura por fvaor:");
		altura = entrada.nextFloat();
		
		area = baseMaior + baseMenor * altura /2;
		System.out.println("sua area total é:" + area);

	}

}
