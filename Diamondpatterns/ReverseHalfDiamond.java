
package Diamondpatterns;

public class ReverseHalfDiamond {
    public static void main(String[] args) {

        int n = 5; // number of rows

        //  Upper part (reverse triangle)
        for(int i = n; i >= 1; i--) {

            // print spaces (for right alignment)
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  "); // double space
            }

            // print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }

        //  Lower part (normal triangle)
        for(int i = 2; i <= n; i++) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }
}

// Output:

// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
