package Diamondpatterns;

public class HallowDiamondPattern {
    public static void main(String[] args) {
        System.out.println("Hallow Diamond Pattern....");

        int n = 5;
        //Upper Part
        for(int i = 1;i <= n; i++){
            //spaces
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int k = 1;k <= (2 * i - 1); k++){

                //Print only border stars
                if( k == 1 || k ==(2 * i - 1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //lower pyramid
        for(int i = n - 1;i >= 1; i--){
            //spaces
            for(int j = 1;j <= n - i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int k = 1;k <= (2 * i - 1); k++){

                 //Print only border stars
                if( k == 1 || k == (2 * i - 1)){
                    System.out.print("*");
                }else{
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
