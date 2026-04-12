package Patterns;

public class ReverseTriangle {
    public static void main(String[] args) {
        System.out.println("Reverse Triangle...");

        // Outer loop -> rows
        for(int i = 5;i >= 1; i--){

            //Inner loop -> columns
            for(int j = 1;j <= i; j++){

                System.out.print("* ");// print star

            }
            System.out.println();// move to next line

        }
    }
    
}
//Output:
// * * * * *
// * * * *
// * * *
// * *
// *
