package Patterns2;

public class InvertedCenteredTriangle {
    public static void main(String[] args) {
        System.out.println("Inverted Centered Triangle...");

        int n = 5;
        for(int i = n; i >= 1; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");//print star
            }

            System.out.println();//next line
        }

    }
    
}

// Output:

// *********
//  *******
//   *****
//    ***
//     *