public class Solution {
	public static boolean isPrime(int N) {
		
    for (int i = 2; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;

  }
  public static void main(String args[]) {
    int n = 20;
    boolean ans = (isPrime(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime Number");
    }
  }
}
