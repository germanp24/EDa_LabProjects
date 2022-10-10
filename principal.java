
public class principal {
	public static void main(String[] args) 
	 {
	  colasEstaticas cola1=new colasEstaticas();
	  cola1.anadir(46);
	  cola1.anadir(12);
	  cola1.anadir(87);
	  cola1.anadir(125);
	  cola1.anadir(30);
	  cola1.quitar();
	  cola1.isEmpty();
	  cola1.contar();
	  System.out.println(cola1.toString());
	 }
}
