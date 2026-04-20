package Mixedpatterns;

public class AlternatingPatternDiamond {
    public static void main(String[] args) {
        System.out.println("Alternating Pattern Diamond....");

        int n = 5;

        //Upper part of diamond
        for(int i = 1; i <= n; i++) {
            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print alternating 1 and 0
            for(int j = 1; j <= (2 * i - 1); j++) {

                if(j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }

        //Lower part of diamond
        for(int i = n - 1; i >= 1; i--) {
            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print alternating pattern again
            for(int j = 1; j <= (2 * i - 1); j++) {

                if(j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
    }
}
  
// Output:

//     1
//    101
//   10101
//  1010101
// 101010101
//  1010101
//   10101
//    101
//     1
