package listinha;

import java.util.ArrayList;
import java.util.Random;

public class questao6lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		for(int i=0; i < 100; i++) {
			int n = random.nextInt(100);
			listNumeros.add(n);
		}
		
		System.out.println("Números pares: ");
		
		for(Integer n: listNumeros) {
			if(n % 2 == 0)
				System.out.println(n);
		}
	}

}
