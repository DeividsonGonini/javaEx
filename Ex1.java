package ExerciciosEntregar;



public class Ex1 {
	
/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que
s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.*/

	public static void main(String[] args) {
		double valor = 0;
		
		for(int i = 1; i <= 500; i++) {
			if(i%2 != 0 && i%3 ==0) {
				valor = valor +i;
			}
		
		}
		System.out.println("A soma �: " + valor);
		
				
		
	}
}
