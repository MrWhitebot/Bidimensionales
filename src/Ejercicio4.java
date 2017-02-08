             import java.util.Scanner;

public class Ejercicio4 {

	public static int countClumps(int[] nums) {

		int contador = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {
				

				contador++;
			}
		}
		/*
		 *  
		 * En este métood vamos a comprobar si se cumple la condición del if. Lo que queremos
		 * averiguar en este ejericio es si el valor de una posición es igual al de la siguiente.
		 * Es decir, si en la posición 0 tenemos el valor 8 y en la posición 1 el valor 8 entonces
		 * lo que hacemos es que en la variable contador se sume una undiad así de esta forma
		 * estamos contando cuantas veces pasa que el valor de una posición es igual al de la 
		 * siguiente. EL ejericio lo que a hacer es perdinos por pantalla 5 valores del 
		 * y nos devolverá cuantas veces pasa mediante el return contador.
		 * El rpcoedemiento de comprobaciones es el similar al del ejercicio 1. Lo que hace
		 * el if del for es comprobar si el valor de la posición actual es igual al de la siguiete
		 * y si lo es entonces que se sume una undiad al contador. El return contador lo que hemos dicho
		 * es que muestre por pantalla el valor del contador que peude ser 0 si no se cumple nunca que 
		 * tengamos dos posiciones consecutivas con el mismo valor. Hay que recordar que estos valores 
		 * que se almacenan en las posiciones del array, son pedidos mediante un scanner del main.
		 */

		return contador;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5]; // se dimensiona el array a 5 posiciones
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++)
			nums[i] = scanner.nextInt(); // se piden lo valores 5 veces mediante el for
		System.out.println("Clumps:" + countClumps(nums));
		/*
		 * en el print se hace una llamada al método countClums y se pone como parametro el array nums
		 * este array lo que hace es pasarle al parametro nums del método countClums los valores
		que ha almacenado mediante el scanner para que se haga toda la comprobación que se ha
		explicado arriba y mediante el return devuelva por pantalla 
		el valor almacenado en contador. Hay que recordar que para poder pasarle como argumento los valores del array 
		nums creado en el main al parametro nums(le hemos puesto el mismo nombre) del método CountClums
		estos deben de ser del mismo tipo es decir en este caso int y además si dimensionas un array unidimensional
		entonces el parametro debe de ser unidimensional también. 
		 */
		
	}
}
