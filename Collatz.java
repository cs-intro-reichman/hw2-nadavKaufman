// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) 
    {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        for (int i = 1; i <= N; i++)
        {
            int s = i;
            int count = 1;

            if (verbose) {
                System.out.print(s + " ");
            }

            
            do {
                if (s % 2 == 0) {
                    s = s / 2;
                } else {
                    s = s * 3 + 1;
                }

                if (verbose) {
                    System.out.print(s + " ");
                }

                count++;

            } while (s != 1);

            if (verbose) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}