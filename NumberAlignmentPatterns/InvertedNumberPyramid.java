package NumberAlignmentPatterns;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        System.out.println("Inverted Number Pyramid.....");

        int n = 5;
        //rows decreasing
        for(int i = n; i >= 1; i--){
            //spacces increase
            for(int j = 1;j <= n - i; j++){
                System.out.print(" ");
            }

            //increasing numbers
            for(int k = 1;k <= i;k++){
                System.out.print(k);
            }

            //decreasing numbers
            for(int k = i -1;k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}

// Output:

// 123454321
//  1234321
//   12321
//    121
//     1
