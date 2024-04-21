// priny a diomand pattern 
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

public class DiamondPttern {
    public static void main(String[] args) {
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
