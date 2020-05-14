package ExerciciosEntregar;

/*Escreva um sistema estruturado que gere os números de 1000 a 1999 e escreva
somente os números que são divisíveis por 11 ou cujo resto é 5.*/

public class Ex2 {
	public static void main(String[] args) {
	
		for(float i = 1000; i <= 1999; i++) {
			float numero = 0;
			if(i%11 ==0 || i % 11 ==  5 && i!= 5 ) {
				numero = i;
				System.out.println("O numero: "+ numero + " é divisivel por 11 ou o resto deu 5");
			}
		}
	
	}
}
