package Hardnumberpatterns;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle....");

        int n = 5;
        //rows
        for(int i = 0;i < n; i++){
            int num = 1;

            //spaces
            for(int j = 1;j < n - i; j++){
                System.out.print(" ");
            }
            //numbers
            for( int j = 0;j <= i; j++){
                System.out.print(num +" ");
                num = num * (i - j) / (j + 1); // formula
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
