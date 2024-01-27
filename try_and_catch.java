public class try_and_catch {

    int a = 10;
    int b = 0;

    public void divide() {
        try {
            int k = a / b;
            // Additional code if needed after the division
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Division by zero is not allowed.");
        }

        catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try_and_catch example = new try_and_catch();
        example.divide();
    }
}
