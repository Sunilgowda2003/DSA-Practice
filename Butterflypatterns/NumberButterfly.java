package Butterflypatterns;

public class NumberButterfly {
    public static void main(String[] args) {
        System.out.println("Number Butterfly....");

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
    
}

// Output:

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
// 1234554321
// 1234  4321
// 123    321
// 12      21
// 1        1
