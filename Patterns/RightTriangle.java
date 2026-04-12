package Patterns;

public class RightTriangle {

    public static void main(String[] args) {
        
     System.out.println("Right Triangle...");

     // Outer loop -> rows
      for(int i = 1;i <= 5; i++){

        // Inner loop -> coloums
        for(int j = 1;j <= i; j++){

            System.out.print("* ");//print star
        }
        System.out.println();// move to next line
    }
 }
    
}
//Output:
// *
// * * 
// * * *
// * * * *
// * * * * *