package Harddiamondpatterns;

public class HallowDiamondWithDiagonalLogic {
    public static void main(String[] args) {
        System.out.println("Hallow Diamond With Diagonal Logic.......");

        int n = 5;

        // loop for full diamond (single loop logic)
        for(int i = 1; i <= 2*n - 1; i++) {

            // calculate row dynamically
            int row = (i <= n) ? i : 2*n - i;

            for(int j = 1; j <= 2*n - 1; j++) {

                // star at both edges
                if(j == n - row + 1 || j == n + row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
 
// Output:

//     *    
//    * *   
//   *   *  
//  *     * 
// *       *
//  *     * 
//   *   *  
//    * *   
//     *  
