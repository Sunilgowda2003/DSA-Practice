package Butterflypatterns;

public class HallowButterflyPattern {
public static void main(String[] args) {
    
        int n = 5;

        // 🔼 Upper part
        for(int i = 1; i <= n; i++) {

            // left side
            for(int j = 1; j <= i; j++) {

                // print star only at borders
                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // inside hollow
                }
            }

            // middle spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right side
            for(int j = 1; j <= i; j++) {

                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // 🔽 Lower part
        for(int i = n - 1; i >= 1; i--) {

            // left side
            for(int j = 1; j <= i; j++) {

                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // middle spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right side
            for(int j = 1; j <= i; j++) {

                if(j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

// Output:

// *                 * 
// * *             * * 
// *   *         *   * 
// *     *     *     * 
// *       * *       * 
// *     *     *     * 
// *   *         *   * 
// * *             * * 
// *                 * 