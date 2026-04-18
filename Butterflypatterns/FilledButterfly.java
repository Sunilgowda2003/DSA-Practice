package Butterflypatterns;

public class FilledButterfly {
    public static void main(String[] args) {
        System.out.println("Filled Butterfly...");

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle filled area (stars instead of spaces)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("*");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}

// Output:

// **********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
// **********
