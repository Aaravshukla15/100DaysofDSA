// You are give with 2d array arr[4][5] . Now print it in WaveForm

public class Waveform {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 13, 4, 5 },
                { 6, 7, 18, 9, 10 },
                { 5, 12, -3, 14, 15 },
                { 16, 17, 8, 19, 20 }
        };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
