package Hardnumberpatterns;

public class ZigZagNumbers {
    public static void main(String[] args) {
        System.out.println("Zig-Zag Numbers....");

        int n = 5;

        for(int i = 1;i <= n; i++){

            for(int j = 1;j <= n; j++){
                //zig-zag condition
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}

// Output:

// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1
