package Patterns;

public class Pyramid {
    public static void main(String[] args) {

        System.out.println("Pyramid Pattern....");

        //rows
        for(int i = 1;i <= 5; i++){
            //print spaces before stars
            for(int j = 1;j <= 5 - i; j++){
                System.out.print(" ");//space
            }

            //print stars (odd numbers: 1,3,5,7,9)
            for(int k = 1;k <= (2 * i - 1); k++){

                System.out.print("*");//star
            }
            System.out.println();//move to next line
        }
    }
    
}
//Output:
//      *
//     ***
//    *****
//   *******
//  *********