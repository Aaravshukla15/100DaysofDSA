// Drwa the Rhombus Pattern
//     *****
//    *****
//   *****
//  *****
// *****

public class Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
