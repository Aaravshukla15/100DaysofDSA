import java.util.Arrays;
import java.util.*; 

public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here

        if(x<=0){
            return new int[0];
        }
        else if(x==1){
            return new int[]{1};
        }
        else{

            int[] smallArray = printNos(x-1);
            int[] newArray = Arrays.copyOf(smallArray,smallArray.length+1);
            newArray[smallArray.length]=x;
            return newArray;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         // Change this to the desired value of n
        int n = inp.nextInt();  
        int[] result = printNos(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
        
    }
}
