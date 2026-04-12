package Patterns;

public class SquarePattern {
    public static void main(String[] args) {
        
        System.out.println("Square Pattern....");
        // outer loop->rows
        for(int i = 1;i <= 5; i++){
            // inner loop->columns
            for(int j = 1;j <= 5; j++){

                System.out.print("* ");// print star
            }
            System.out.println();// move to next line
        }
    }
    
}

//Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
