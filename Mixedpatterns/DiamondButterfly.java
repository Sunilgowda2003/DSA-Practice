package Mixedpatterns;

public class DiamondButterfly {
    public static void main(String[] args) {
        System.out.println("Diamond Butterfly......");

        int n = 5;

        // Upper part (butterfly style)
        for(int i = 1; i <= n; i++) {

            // left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // middle spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //  Lower part (diamond style)
        for(int i = n - 1; i >= 1; i--) {

            // spaces (center alignment)
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
   
// Output:

// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
//  * * * * * * * 
//   * * * * * 
//    * * * 
//     * 