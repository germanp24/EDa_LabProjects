package List;

public class main {
System.out.print("Introduce que operación deseas realizar:\n");
		System.out.println(" 1. Añadir termino al diccionario");
		System.out.println(" 2. Eliminar termino del diccionarios");
		System.out.println(" 3. Consultar definicion");
		System.out.println(" 4. Consultar número de términos definidos");
		int casos=TECLADO.nextInt();
		while (casos>0){
			switch(casos) {
				case 1: 
					System.out.println("Añadir termino al diccionario");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuación introduzca el precio actual de la acción");
					//metodo de compra de acciones
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 2:
					System.out.println("Eliminar termino del diccionarios");
					//System.out.println("Introduzca el numero de acciones que desee comprar");
					//System.out.println("A continuación introduzca el precio actual de la acción");
					//metodo de venta de acciones de acciones
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 3:
					System.out.println("Consultar definicion");
					// Los cambios que se hagan en la opcion 1 y 2 se tienen que actualizar inmediatamente
					// mostrar la ganancia total obtenida hasta ese momento
					System.out.print("Introduzca la operación que desea realizar: ");
					casos=TECLADO.nextInt();
				break;
				case 4:
					System.out.println("Consultar número de términos definidos");
					casos=TECLADO.nextInt();
				default:
					// falta resolver excepcion para que el programa continue y nos vuelva a pedir introducir numero de operación
					System.out.println("Error, por favor seleccione una de las opciones válidas.");
					System.out.print("Introduce que operación deseas realizar:");
					System.out.println(" 1. Añadir termino al diccionario");
					System.out.println(" 2. Eliminar termino del diccionarios");
					System.out.println(" 3. Consultar definicion");
					System.out.println(" 4. Consultar número de términos definidos");
					casos=TECLADO.nextInt();
			}
		}
	}

}
