
public class LeftAlignedPyramid {
    public static void main(String[] args) {

        System.out.println("Left Aligned Triangle....");
        int n = 5;
        //rows
        for(int i = 1;i <= n; i++){
            // stars increase each row
            for(int j = 1;j <= i; j++){

                System.out.print("*");//print star

            }
            System.out.println();//next line
        }
    }
}

// Output:

// *
// **
// ***
// ****
// *****