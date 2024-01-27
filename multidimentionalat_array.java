public class multidimentionalat_array {

    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Access and print individual elements
        System.out.println("Element at row 1, column 2: " + matrix[0][1]);

        // Update an element
        matrix[1][1] = 10;

        // Access and print the updated element
        System.out.println("Updated element at row 2, column 2: " + matrix[1][1]);

        // Find the number of rows and columns in the 2D array
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        System.out.println("Number of rows: " + numRows);
        System.out.println("Number of columns: " + numCols);

        // Iterate through the 2D array and print all elements
        System.out.println("2D Array elements:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
