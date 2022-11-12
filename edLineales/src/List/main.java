package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
	 static Scanner TECLADO = new Scanner(System.in);
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ListDynamic<Diccionario> diccionario = new ListDynamic<Diccionario>();
	private static Diccionario dic, dicc;
	

	public static void main(String[] args) {
		 String Termino = null;
		String Definicion=null;
		System.out.print("Introduce que operación deseas realizar:\n");
		System.out.println(" 1. Añadir termino al diccionario");
		System.out.println(" 2. Eliminar termino del diccionarios");
		System.out.println(" 3. Consultar definicion");
		System.out.println(" 4. Consultar número de términos definidos");
		int casos = TECLADO.nextInt();
		{
			while (casos > 0) {
				switch (casos) {
				case 1:
					dic = new Diccionario(null, null);
					System.out.println("Escriba el termino");
			
					try {
						Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					dic.setTermino(Termino);
					System.out.println("Escriba la definicion del termino");
					
					try {
						Definicion = Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						dic.setDefinicion(Definicion);
					
					
					diccionario.add(dic);
					 
					System.out.print("Introduzca la operación que desea realizar: ");

					casos = TECLADO.nextInt();
					break;
				case 2:
					System.out.println("Eliminar termino del diccionarios");
					Termino = TECLADO.next();
					dicc = new Diccionario(Termino, null);

					diccionario.remove(diccionario.locate(dicc));

					System.out.print("Introduzca la operación que desea realizar: ");
					casos = TECLADO.nextInt();
					break;
				case 3:
					System.out.println("Consultar definicion");
					try {
						Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					dicc = new Diccionario(Termino, null);
					System.out.println("La definicion del termino " + Termino + " es : \n"
							+ diccionario.get(diccionario.locate(dicc)).getDefinicion()+"\n");

					System.out.print("Introduzca la operación que desea realizar: ");
					casos = TECLADO.nextInt();
					break;
				case 4:
					System.out.println("Consultar número de términos definidos");
					System.out.println("El numero de terminos definidos es: " + diccionario.size());
					System.out.print("Introduzca la operación que desea realizar: \n");
					casos = TECLADO.nextInt();
				default:
					// falta resolver excepcion para que el programa continue y nos vuelva a pedir
					// introducir numero de operación
					System.out.println("Error, por favor seleccione una de las opciones válidas.");
					System.out.print("Introduce que operación deseas realizar: \n");
					System.out.println(" 1. Añadir termino al diccionario");
					System.out.println(" 2. Eliminar termino del diccionarios");
					System.out.println(" 3. Consultar definicion");
					System.out.println(" 4. Consultar número de términos definidos");
					casos = TECLADO.nextInt();
				}
			}
		}
	}
}