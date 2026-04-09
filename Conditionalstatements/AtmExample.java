package Conditionalstatements;

public class AtmExample {
    public static void main(String[] args) {
        int balance=10000;//change value To check the conditions 

        int pin=1234;

        int enterPin=1234;//Change pin to check wrong pin statement

        int choice=3;// change the choice to check --->1-Check Balance, 2-Withdraw, 3-Deposit

        int amount=3000;

        //If condition (Check PIN)
        if(enterPin == pin){
            System.out.println("PIN Verified");

            //SWITCH condition for menu
            switch(choice){
                case 1:
                    System.out.println("Your Balance: "+balance);
                    break;
                
                case 2:
                    //SIMPLE IF (deposit validation)
                    if(amount <= balance){
                         System.out.println("Withdraw Successful!....");
                         balance = balance - amount;
                         System.out.println("Remaining Balance: "+balance);
                    }else{
                        System.out.println("Insufficient Balance");
                    }
                      break;

                case 3:
                    //SIMPLE IF (deposit validation)
                    if(amount > 0){
                        balance = balance + amount;
                        System.out.println("Deposit Successfully!.....");
                        System.out.println("Updated Balance: "+balance);
                    }
                    break;
                
                default:
                    System.out.println("Invalid Choice !");    
            }
            //ELSE-IF LADDER (balance status)
            if(balance > 5000){
                System.out.println("Balance Status: Good ");
            }else if(balance > 3000){
                System.out.println("Balance Status: Average");
            }else{
                System.out.println("Balance Status: Low...");
            }  
        }else{
            System.err.println("WRONG PIN....");
        }
    }
    
}
