public class TimeCalc {
    public static void main(String[] args) {
        
        String total = args[0];
        int addM =  Integer.parseInt(args[1]);
        int h = Integer.parseInt(total.substring(0,2));
        int m = Integer.parseInt(total.substring(3));
        int totalM = h * 60 + m + addM;
        int newH = (totalM/60) % 24 ;
        int newM = totalM % 60; //
        if((newH<10) && (newM<10) )
        {
           System.out.println("0" + newH + ":" + "0" + newM  );
        }
        if((newH<10) && (newM>=10))
        {
            System.out.println("0" + newH + ":" + newM  );
        }
         if((newH>=10) && (newM<10))
        {
            System.out.println(newH + ":" + "0" + newM  );
        }
         if((newH>=10) && (newM>=10))
        {
            System.out.println(newH + ":" + newM  );
        }

        }
        
     
        
        

    
    
    
    }

