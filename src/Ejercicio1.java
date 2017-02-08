
public class Ejercicio1 {

	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = true;
		for (int i = 0; i < listado2.length - 1; i++) {
			if (listado2[i] > listado2[i + 1]) {
				isSort = false;
			}
			/*Nota: "i" es el �ndice del array e sdecir la posici�n (en estos arrays, 
			 * las posiciones van de la 0 a la 6). Cada posici�n almacena un valor.
			 * Para saber si un array est� ordenado o no sin usar la funci�n sort,
			 * creamos un for for que recorra nuestro array pero hasta la posici�n
			 * pen�ltima porque por ejemplo en el listado1, al llegar al 5 queremos
			 * que se compare con 7 y al hacer la comprobaci�n no es necesario comparar
			 * el 7 con otra posici�n porque no hay otra por encima y nos dar�a error.
			 * El if del for lo que hace es comprobar desde la posici�n 0 (para listado1
			 *  es el 6 y para listado2 el 1) hasta la pen�ltima posici�n
			 * (que en listado 1 es el valor 5 y en el listado 2 el valor 6). De tal modo,
			 * se dice que si el valor de la posici�n 0 es mayor qu el de la siguiente 
			 * posici�n (i+1) entonces que se almacene en la variable isSort (falso) es decir,
			 * que no est� ordenado. As� se va comprobando hasta que llega en el caso de listado 1
			 * al 5 que se compara con el 7 y en listado 2 que se compara el 6 con el 7.
			 *El listado1 como se puede apreciar, est� desordenado y por tanto se guardar� false
			 *En cambio el listado2, est� ordenado pues [i] siempre es menor que [i+1]. De este modo,
			 *en la variable isSort se queda po defecto el true de que si est� ordenado.
			 *Luego se hace un if/else que mostrar� por pantalla un mensaje u otro dependiendo
			 *del resultado de la variable isSort.
			 *Por �ltima, para comprobar un array u otro basta con que sustituyamos el nombre del array
			 *del for y del if por el del otro.
			 */
		}
			if (isSort==false)
				System.out.println("El vector NO est� ordenado");
				
			else
				System.out.println("El vector est� ordenado");
		

	}
}
