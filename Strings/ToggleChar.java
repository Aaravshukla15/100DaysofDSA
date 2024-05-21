// Toogle the inputed character array. 

import java.util.Scanner;

public class ToggleChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input int");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        System.out.println("Input string");
        String st = sc.nextLine();

        if (st.length() != n) {
            System.out.println("The length of the input string does not match the specified length.");
        }

        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = st.charAt(i);
        }
        Toggle(ch);

        System.out.println("Toggled characters:");
        System.out.println(new String(ch));
        sc.close();
    }

    public static void Toggle(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }
}
