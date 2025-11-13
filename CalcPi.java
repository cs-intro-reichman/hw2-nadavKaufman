// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int t =  Integer.parseInt(args[0]);
		double sum = 0, n = 1 ;
		for(int i = 1; i <= t; i++)
	{
			if( i %2  != 0)
			{
             sum = sum + (1 / n) ;
			}
			else
			{
			 sum = sum - (1 / n) ;
			}
			n = n + 2;
		}
		sum = sum * 4 ;
        System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum);
		}

  	
}
