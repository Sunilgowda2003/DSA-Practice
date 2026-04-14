package Patterns2;

public class HalfDiamondTriangle {
    public static void main(String[] args) {
        System.out.println("Half Diamond Triangle....");

        int n = 5;

         // upper triangle(Increasing the stars)
        for(int i = 1; i <= n; i++) {    //Outer loop->rows

            for(int j = 1; j <= i; j++) {   //Inner loop -> stars increase
                System.out.print("* ");  // print stars
            }
            System.out.println();
        }

        // lower triangle(Decreasing the stars)
        for(int i = n - 1; i >= 1; i--) {  // start from n-1 to avoid duplicate middle row

            for(int j = 1; j <= i; j++) {   //stars decrease
                System.out.print("* "); // print stars
            }
            System.out.println();//next line
        }
    }
    
}

// Output:

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
