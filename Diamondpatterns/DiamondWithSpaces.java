package Diamondpatterns;

public class DiamondWithSpaces {
    public static void main(String[] args) {
        System.out.println("Diamond with spaces between Stars....");

        int n = 5;
        //Upper
        for(int i = 1;i <= n; i++){

            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }

            for(int k = 1;k <= i; k++){
                System.out.print("* ");//print stars with space
            }
            System.out.println();
        }

        //Lower
        for(int i = n - 1;i >= 1; i--){

            for(int j = 1;j <= n - i;j++){
                System.out.print(" ");
            }

            for(int k = 1;k <= i; k++){
                System.out.print("* ");//print stars with space
            }
            System.out.println();
        }
    }
    
}

// Output:

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
