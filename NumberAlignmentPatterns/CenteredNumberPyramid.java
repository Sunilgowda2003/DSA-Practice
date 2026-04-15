package NumberAlignmentPatterns;

public class CenteredNumberPyramid {
    public static void main(String[] args) {
        System.out.println("Centered Number Pyramid....");

        int n = 5;
        //rows
        for(int i = 1;i <= n; i++){
            //spaces
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }
            //increasing the numbers
            for(int k = 1;k <= i; k++){
                System.out.print(k);
            }
            //decreasing the numbers
            for(int k = i - 1;k >= 1; k--){
                System.out.print(k);
            }
            //move to next line
            System.out.println();
        }
    }
    
}

// Output:

//     1
//    121
//   12321
//  1234321
// 123454321