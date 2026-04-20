package Mixedpatterns;

public class NumberStarDiamond {
    public static void main(String[] args) {
        System.out.println("Number Star Diamond Pattern....");

        int n = 5;

        // upper
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower
        for(int i = n - 1; i >= 1; i--) {

            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
  
// Output:

//     1*
//    12**
//   123***
//  1234****
// 12345*****
//  1234****
//   123***
//    12**
//     1*