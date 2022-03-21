package listinha;

import java.util.ArrayList;
import java.util.Scanner;

public class questao2lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		for(int i=0; i < 10; i++) {
			int n = entrada.nextInt();
			listNumeros.add(n);
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println(listNumeros.get(i-1));
		}

	}

}
