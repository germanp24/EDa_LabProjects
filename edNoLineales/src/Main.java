import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	String p1=null,p2=null;
	int peso=0;
		Scanner sc = new Scanner(new File("C:\\Users\\Victo\\git\\EDA\\edNoLineales\\marvel-unimodal-edges.csv"));
		sc.nextLine();
		while(sc.hasNextLine() ) {
			
			
          String[] tokens= sc.nextLine().split(",");
         
         
          if (tokens.length==3) {
        	  p1=tokens[0];
              p2=tokens[1];
              peso=Integer.parseInt(tokens[2]);
          } else if(tokens.length==4) {
        	  for(int i=0;i<tokens[0].length();i++) {
        		  if(tokens[0].charAt(i)== '"');
        	  }
        		  p1=tokens[0]+tokens[1];
            	  p2=tokens[2] ;
            	  peso=Integer.parseInt(tokens[3]);
        	  
        	  
          }else if(tokens.length==5) {
        	  p1=tokens[0]+tokens[1];
        	  p2=tokens[2] + tokens[3];
        	  peso=Integer.parseInt(tokens[4]);
          }else {
    		  p1=tokens[0];
        	  p2=tokens[1] + tokens[2];
        	  peso=Integer.parseInt(tokens[3]);
    	  }
          
        System.out.println(p1 +" , "+p2+" , "+ peso);
        }
		
        sc.close();
	}
	

}
