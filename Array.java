public class Array {
    public static void main(String[] args) {

        // Declare an array of integers
        int[] numbers;

        // Initialize the array with size 5
        numbers = new int[5];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print individual elements
        System.out.println("Element at index 2: " + numbers[2]);

        // Update an element
        numbers[2] = 35;

        // Access and print the updated element
        System.out.println("Updated element at index 2: " + numbers[2]);

        // Find the length of the array
        int arrayLength = numbers.length;
        System.out.println("Array length: " + arrayLength);

        // Iterate through the array and print all elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop (for-each) to iterate through the array
        System.out.println("Array elements using for-each:");
        for (int num : numbers) {
            System.out.println(num);
        }

        int[] a = { 1, 2, 34, 5, 6, 7, 8 };
        for (int i = 1; i <= a.length; i++) {
            System.out.println("Values of the array is " + i);
        }

    }
}
