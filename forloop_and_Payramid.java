public class forloop_and_Payramid {
    // 1. Write a Java program to print the numbers from 50 to 74
    public static void main(String[] args) {

        // Logic building
        // *****
        // ****
        // ***
        // **
        // *

        int k = 1;
        for (int i = 0; i < 5; i++) {
            // System.out.println(i);
            for (int j = 0; j <= 4 - i; j++) {
                if (k == 1) {
                    System.out.print("*");
                }
                // System.out.print(k);
                // k++;
            }
            System.out.println();
        }

        // Logic
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // for (int i = 5; i >= 1; i--) {
        // // Initialize the inner loop variable to 1
        // int j = 1;
        // // Start the inner loop and increment the loop variable by 1 until it reaches
        // // the current outer loop variable
        // for (; j <= i; j++) {
        // // Print the current number in the inner loop
        // System.out.print(j + " ");
        // }
        // // Print a new line after each iteration of the outer loop
        // System.out.println();
        // }
    }
}
