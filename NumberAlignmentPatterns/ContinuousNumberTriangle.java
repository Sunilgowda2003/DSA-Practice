package NumberAlignmentPatterns;

public class ContinuousNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Continuous Number Triangle...");

        int n = 5;
        int num = 1;

        //rows
        for(int i = 1;i <= n; i++){

            //spaces
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }
            //Continuous numbers
            for(int k = 1;k <= i; k++){
                System.out.print(num+" ");
                num++;//increment number
            }
            System.out.println();
        }
    }
    
}

// Output:

//     1 
//    2 3 
//   4 5 6 
//  7 8 9 10 
// 11 12 13 14 15 
