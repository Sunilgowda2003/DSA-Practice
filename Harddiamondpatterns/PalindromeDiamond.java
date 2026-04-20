package Harddiamondpatterns;

public class PalindromeDiamond {
    public static void main(String[] args) {
        System.out.println("Palindrome Diamond Pattern....");

        int n = 5;

        // Upper part
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // decreasing numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // increasing numbers
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower part
        for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    
}

// Output:

//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1