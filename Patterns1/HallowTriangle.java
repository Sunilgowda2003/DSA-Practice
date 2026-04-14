

public class HallowTriangle {
    public static void main(String[] args) {
        
        System.out.println("Hallow Triangle...");
        int n = 5;
        // Outer loop -> rows
        for(int i = 1;i <= n; i++){
            // Inner loop -> columns
            for(int j = 1; j <= i; j++){
                // Print star only at borders
                if(j == 1 || j == i || i == n){
                    System.out.print("* ");//print star
                }else{
                    System.out.print("  ");//space inside
                }

            }
            System.out.println();//next line

        }
    }
    
}
//Uutput
// * 
// * * 
// *   * 
// *     * 
// * * * * * 