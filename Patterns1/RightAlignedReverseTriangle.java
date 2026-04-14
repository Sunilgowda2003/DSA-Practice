

public class RightAlignedReverseTriangle {

    public static void main(String[] args) {

        System.out.println("Right Aligned Reverse Triangle...");

        int n = 5;

        // outer loop → rows
        for(int i = n; i >= 1; i--){

            // print spaces before stars
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");//space
            }

            // print stars
            for(int k = 1; k <= i; k++){
                
                System.out.print("*"); 
            }

            // move to next line
            System.out.println();
        }
    }
}
// Output:

// *****
//  ****
//   ***
//    **
//     *