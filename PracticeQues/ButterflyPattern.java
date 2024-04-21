
// Draw the butterfly patter linke this
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        // upper Half
        for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // last part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            // right part
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = spaces; j >= 1; j--) {
                System.out.print(" ");
            }
            // last part
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}