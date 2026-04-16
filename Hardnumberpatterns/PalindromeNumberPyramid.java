package Hardnumberpatterns;

public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        System.out.println("Palindrome Number Pyramid....");

        int n = 5;
        //rows
        for(int i = 1;i <= n; i++){
            //spaces
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }
            //decreasing numbers
            for(int k = i;k >= 1; k--){
                System.out.print(k);
            }
            //increasing numbers
            for(int k = 2;k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}

// Output:

//     1
//    212
//   32123
//  4321234
// 543212345