package Mixedpatterns;

public class ZigZag {
    public static void main(String[] args) {
        System.out.println("Zig Zag Pattern....");
    
        int n = 15;

        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= n; j++) {

                // zig-zag condition
                if((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
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

//   *   *   *   *
//  * * * * * * * 
// *   *   *   * 