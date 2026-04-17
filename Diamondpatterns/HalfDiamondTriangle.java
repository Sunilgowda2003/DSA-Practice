package Diamondpatterns;

public class HalfDiamondTriangle {
    public static void main(String[] args) {
        System.out.println("Half Diamond Triangle Pattern....");

         int n = 5; // number of rows

        // 🔼 Upper part (increasing triangle)
        for(int i = 1; i <= n; i++) {

            // print spaces before stars (right alignment)
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  "); // double space for proper shape
            }

            // print stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }

        // 🔽 Lower part (decreasing triangle)
        for(int i = n - 1; i >= 1; i--) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // next line
            System.out.println();
        }
    }
    
}

// Output:

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 
