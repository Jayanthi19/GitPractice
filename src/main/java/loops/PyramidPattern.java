package loops;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <=  rows - i +1; j++) {
                System.out.print(" *");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
