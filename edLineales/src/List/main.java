package List;

public class main {
System.out.print("Introduce que operaci�n deseas realizar:\n");
		System.out.println(" 1. A�adir termino al diccionario");
		System.out.println(" 2. Eliminar termino del diccionarios");
		System.out.println(" 3. Consultar definicion");
		System.out.println(" 4. Consultar n�mero de t�rminos definidos");
		int casos=TECLADO.nextInt();
		while (casos>0){
			switch(casos) {
				case 1: 
					System.out.println("A�adir termino al diccionario");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuaci�n introduzca el precio actual de la acci�n");
					//metodo de compra de acciones
					System.out.print("Introduzca la operaci�n que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 2:
					System.out.println("Eliminar termino del diccionarios");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuaci�n introduzca el precio actual de la acci�n");
					//metodo de venta de acciones de acciones
					System.out.print("Introduzca la operaci�n que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 3:
					System.out.println("Consultar definicion");
					// Los cambios que se hagan en la opcion 1 y 2 se tienen que actualizar inmediatamente
					// mostrar la ganancia total obtenida hasta ese momento
					System.out.print("Introduzca la operaci�n que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 4:
					System.out.println("Consultar n�mero de t�rminos definidos");
					casos=TECLADO.nextInt();
				default:
					// falta resolver excepcion para que el programa continue y nos vuelva a pedir introducir numero de operaci�n
					System.out.println("Error, por favor seleccione una de las opciones v�lidas.");
					System.out.print("Introduce que operaci�n deseas realizar:");
					System.out.println(" 1. A�adir termino al diccionario");
					System.out.println(" 2. Eliminar termino del diccionarios");
					System.out.println(" 3. Consultar definicion");
					System.out.println(" 4. Consultar n�mero de t�rminos definidos");
					casos=TECLADO.nextInt();
			}
		}
	}

}
