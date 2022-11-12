package Stack;

/**
 * The "Main" class is the class from which we will generate the
 * pertinent stacks and show its operation by means of examples.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args){
        
        StackStatic <Integer> pilaEstatica = new StackStatic<Integer>(); //Esto no funciona, hay que ver como generar una pila.

        //Aniado 4 valores a la pila estatica.
        pilaEstatica.push(2);
        pilaEstatica.push(3);
        pilaEstatica.push(4);
        pilaEstatica.push(5);

        pilaEstatica.toString();
    }
}