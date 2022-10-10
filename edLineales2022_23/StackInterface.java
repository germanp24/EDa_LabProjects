package edLineales2022_23;

public interface StackInterface <T> {

    //Lookout how to do JAVADOC

    public void push (T element);
    public T pop ();
    public T top ();
    public boolean IsEmpty();
    public int size();
    public String toString();
}
