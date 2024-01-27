/**
 * pyramid
 */
public class pyramid {

    public static void main(String[] args) {

        int n = 5; // size of the pyramid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // number pyramids

        // TODO Auto-generated method stub
        // nested loops works -
        int k = 1;
        for (int i = 0; i < 4; i++) // (outer for loop) this block will loop for 4 times
        {
            // System.out.println( "outer loop started");
            for (int j = 1; j <= 4 - i; j++) // inner loop
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }
    }
}