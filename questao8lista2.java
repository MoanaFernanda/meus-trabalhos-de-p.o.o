package listinha;

import java.util.ArrayList;
import java.util.Random;

public class questao8lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		for(int i=0; i < 100; i++) {
			int n = random.nextInt(100);
			listNumeros.add(n);
		}
		
		System.out.println("Números Primos: ");
		
		for(Integer n: listNumeros) {
			if(isPrimo(n) == true)
				System.out.println(n);
		}
		
	}
	
	public static boolean isPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
		
		return true;
	}

}
