package edLineales2022_23;

public class DynamicStack<T> implements StackInterface<T> {
    //Instance variables
    private Node<T> top;    //The node representing the top element
    private int size = 0;   //The size of the stack

    public DynamicStack() {
        top = null;     //When the stack is created the top node refers to null
    }

    public void push(T element) {
        Node<T> aux = new Node<T> (element, top);   //Linking the new aux element to old aux element

        top= aux; //Updating top
        size++;
    }
}
