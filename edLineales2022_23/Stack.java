package edLineales2022_23;

public interface Stack <T> {

    //Lookout how to do JAVADOC

    public void push (T element);
    public T pop ();
    public T top ();
    public boolean IsEmpty();
    public int size();
    public String toString();
}
