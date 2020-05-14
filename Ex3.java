package ExerciciosEntregar;

/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
estiver.*/

public class Ex3 {
	public static void main(String[] args) {

		int i = 0;
		for ( i = 233; i <= 456; i += 3) {
			if(i >299  && i<= 400 ) {
				i+= 2;
			}
								
		System.out.println("contagem = " + i);
	}
	}
}
