package listinha;

import java.util.ArrayList;
import java.util.Random;

public class questao4lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		int media = 0;
		
		for(int i=0; i < 100; i++) {
			int n = random.nextInt(100);
			listNumeros.add(n);
		}
		
		for(Integer n: listNumeros) {
			media += n;
		}
		
		System.out.println("Média: ");
		System.out.println(media/100);
	}

}
