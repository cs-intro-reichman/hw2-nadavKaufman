//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {

      
        String s = args[0] ;  
	int n =  Integer.parseInt(args[1]);
        String c = "AEFHILMNORSX" ;
        s = s.toUpperCase() ;
        for(int i=0 ; i < s.length() ; i++)
        {
         if(c.indexOf(s.charAt(i)) != -1)
         {
         System.out.println("Give me an " + s.charAt(i) + ": " + s.charAt(i) + "!");
         }
         else
         {
         System.out.println("Give me a  " + s.charAt(i) + ": " + s.charAt(i) + "!");
         }
        }
        System.out.println("What does that spell?" );
         for(int i=0 ; i < n ; i++)
         {
        System.out.println( s + "!!!");
         }        
}
}
