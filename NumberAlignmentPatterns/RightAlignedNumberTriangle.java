package NumberAlignmentPatterns;

public class RightAlignedNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Right Aligned Number Triangle...");

        int n = 5;
        //outer loop->rows
        for(int i = 1;i <= n; i++){

            //print spaces before numbers
            for(int j = 1;j <= n-i; j++){
                System.out.print(" ");
            }
            //prints number from 1 to i
            for(int k = 1;k <= i;k++){
                System.out.print(k);
            }
            System.out.println();//next line
        }
    }
    
}

// Output:

//     1
//    12
//   123
//  1234
// 12345