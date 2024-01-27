
public class try_and_catch2 {

    public static void main(String[] args) {
        int b = 7;
        int c = 0;

        try {
            // Purchased failed
            int k = b / c;
            int arr[] = new int[5];
            System.out.println(arr[7]);
        } catch (ArithmeticException et) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } catch (IndexOutOfBoundsException ets) {
            System.out.println("Caught IndexOutOfBoundsException: Index out of bounds.");
        } catch (Exception e) {
            System.out.println("Caught Exception: An error occurred.");
        } finally {
            System.out.println("Finally block: This block is executed irrespective of exceptions thrown or not.");
        }
    }
}
