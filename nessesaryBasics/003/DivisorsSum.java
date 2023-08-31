public class DivisorsSum {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        
        int sums=0;
        int newArr[] = new int[n+1];
        for(int i=1; i<=n;i++){
            int divSum = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divSum = j+divSum;
                }
            }
            newArr[i]=divSum; 
        }
        for (int k=0;k<=n;k++){
            sums = sums+newArr[k];
        }
        return sums;
    }
}
