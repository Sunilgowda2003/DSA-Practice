package Additionalstarpatterns;

public class RightAlignedPyramid {
    public static void main(String[] args) {

        System.out.println("Right Aligned Pyramid...");

        int n = 5;

        //rows
        for(int i = 1;i <= n; i++){

            // print spaces before stars
            for(int j = 1;j <= n - i; j++){

                System.out.print(" ");//space
            }
             // print stars
            for(int k = 1;k <= i; k++){

                System.out.print("*");
            }
            System.out.println();//next line
        }
    }
    }
    

// Output:

//     *
//    **
//   ***
//  ****
// *****