package listinha;

import java.util.ArrayList;
import java.util.Random;

public class questao7lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		int numMaior = 0;
		int numMenor = 101;
		
		for(int i=0; i < 100; i++) {
			int n = random.nextInt(100);
			listNumeros.add(n);
		}
		
		for(Integer n: listNumeros) {
			if (n > numMaior)
				numMaior = n;
			if (n < numMenor)
				numMenor = n;
		}
		System.out.println("Número maior: ");
		System.out.println(numMaior);
		
		System.out.println("Número menor: ");
		System.out.println(numMenor);
	}

}
