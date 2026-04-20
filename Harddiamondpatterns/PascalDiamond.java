package Harddiamondpatterns;

public class PascalDiamond {
    public static void main(String[] args) {
        System.out.println("Pascals Diamond....");

        int n = 5;
        //upper
        for(int i = 0;i < n; i++){

            int num = 1;
            //spaces
            for(int j = 1;j < n - i; j++){
                System.out.print(" ");
            }
            //pascals numbers
            for(int j = 0;j <= i; j++){
                System.out.print(num +" ");
                num = num * (i - j)/(j + 1);
            }
            System.out.println();
        }

         // lower
        for(int i = n - 2; i >= 0; i--) {

            int num = 1;

            for(int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
 
// Output:

//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 
//  1 3 3 1 
//   1 2 1 
//    1 1 
//     1 
