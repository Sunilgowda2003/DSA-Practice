package Additionalstarpatterns;

public class Xpattern {
    public static void main(String[] args) {
        
        System.out.println("X Pattern...");

        int n = 5;
        //rows
        for(int i = 1;i <= n; i++){
            //columns
            for(int j = 1;j <= n; j++){
                // print star at diagonals
                if(i == j || i + j == n + 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();//next line

        }
    }
    
}

// Output:

// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 