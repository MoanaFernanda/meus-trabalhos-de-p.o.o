package listinha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class questao3lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		for(int i=0; i < 100; i++) {
			int n = random.nextInt(100);
			listNumeros.add(n);
			System.out.println(n);
		}
		
		System.out.println("---------------------------");
		
		for (int i = 100; i > 0; i--) {
			System.out.println(listNumeros.get(i-1));
		}

	}

}
