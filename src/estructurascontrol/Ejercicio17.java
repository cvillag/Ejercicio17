// Realizar un pseudoc�digo que visualice en pantalla un tri�ngulo pitag�rico. La base tiene que tener igual n�mero de caracteres que la altura.

package estructurascontrol;

import java.util.Scanner;

public class Ejercicio17 
{
	public static void main(String[] args)
	{
	
		//Crear un objeto de tipo esc�ner para meter la informaci�n por teclado
		Scanner entrada = new Scanner (System.in);
		//TODO: Crear otro scanner
			
			//Pedir la base o la altura por teclado
			System.out.println("Introduce la base o altura: ");
			int medida = entrada.nextInt();
			
			//Crear el bucle de impresi�n 
			for (int altura = 1 ; altura <= medida ; altura++)
			{
				for (int base = 1; base <= altura; base++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
		
	}
}
