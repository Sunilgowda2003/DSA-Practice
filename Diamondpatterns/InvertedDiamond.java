package Diamondpatterns;

public class InvertedDiamond {
    public static void main(String[] args) {
        System.out.println("Inverted Diamond (X shape style)");

        int n = 5;

        for(int i = 1;i <= n; i++){

            for(int j = 1;j <= n; j++){

                // print star at borders
                if(j == i || j == n - i + 1){
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

// *   *
//  * * 
//   *  
//  * * 
// *   *