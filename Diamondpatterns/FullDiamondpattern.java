package Diamondpatterns;

public class FullDiamondpattern {
    public static void main(String[] args) {
        System.out.println("Full Diamond Patterns.....");

        int n = 5;
        //Upper pyramid
        for(int i = 1;i <= n; i++){
            //spaces
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int k = 1;k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();//nexxt line
        }
        //Lower pyramid
        for(int i = n - 1;i >= 1;i--){
            //print spaces
            for(int j = 1;j <= n-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int k = 1;k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}

// Output:

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
