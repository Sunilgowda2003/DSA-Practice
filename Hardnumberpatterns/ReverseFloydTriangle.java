package Hardnumberpatterns;

public class ReverseFloydTriangle {
    public static void main(String[] args) {
        System.out.println("Reverse Floyd Triangle...");

        int n = 5;
        int num = n * (n + 1) / 2; // total numbers

        for(int i = n;i >= 1; i--){

            for(int j = 1;j <= i; j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }

    }

    
}

// Output:

// 15 14 13 12 11
// 10 9 8 7
// 6 5 4
// 3 2
// 1