package Conditionalstatements;

public class ElseIfLadderExample {
    public static void main(String[] args) {

        int marks = 85;//change this value to check different conditions

        if(marks >= 75){
            System.out.println("Distinction");

        }else if(marks >= 60){
            System.out.println("First Class");

        }else if(marks >= 50){
            System.out.println("Second Class");

        }else if(marks >= 35){
            System.out.println(" Just Pass");

        }else{
            System.out.println("Fail");
        }
    }
    
}
