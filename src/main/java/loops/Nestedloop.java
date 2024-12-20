package loops;
public class Nestedloop {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        
        // Outer loop to go through each row
        for (int i = 1; i <= 4; i++) {
            
            // Inner loop 1: Print spaces before stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" "); // Printing spaces
            }
            
           
            
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}

