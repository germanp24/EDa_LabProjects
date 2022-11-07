package Stack;

public class Main {
    public static void main(String[] args){
        
        StackStatic <Integer> pilaEstatica = new StackStatic<Integer>();

        //Aniado 4 valores a la pila estatica.
        pilaEstatica.push(2);
        pilaEstatica.push(3);
        pilaEstatica.push(4);
        pilaEstatica.push(5);

        pilaEstatica.toString();
    }
}
