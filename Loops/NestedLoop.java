package Loops;

public class NestedLoop {
    public static void main(String[] args) {

        //Outer loop controls rows 
        for(int i = 1;i <= 5; i++){

            //Inner loop controls columns
            for(int j = 1;j <= 5; j++){

                //print star
                System.out.print("* ");
            }
            //move to next line after inner loop
            System.out.println();
        }

    }
    
}
