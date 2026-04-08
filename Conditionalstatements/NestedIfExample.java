package Conditionalstatements;

public class NestedIfExample {
    public static void main(String[] args) {
        int attendance = 80;//Change the number to see the "Not Allowed due to Low Attendance"

        boolean hasHallTicket = true;//change to false to see "Hall Ticket Required"

        if(attendance >=75){
            if(hasHallTicket){
                System.out.println("Allowed to Write Exam");
            }else{
                System.out.println("HallTicket Required");
            }

        }else{
            System.out.println("Not Allowed due to Low Attendance");
        }

    }
}
