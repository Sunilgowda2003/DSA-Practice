package Diamondpatterns;

public class ReverseHalfDiamondPattern {
    public static void main(String[] args) {
        System.out.println("Reverse Half Diamond Pattern...");

        int n = 5;

        // upper (reverse triangle)
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower (normal triangle)
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }

//  Output:

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
    

