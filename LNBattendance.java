import java.util.Scanner;

public class LNBattendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        char[][] data = new char[w][e];
        for (int i = 0; i < w; i++) {
            String line = sc.nextLine();
            data[i] = line.toCharArray();
        }

        int maxLen = 0;
        int currentLen = 0;
        int start = 0;
        int tempStart = 0;

        for (int i = 0; i < w; i++) {
            boolean allPresent = true;
            for (int j = 0; j < e; j++) {
                if (data[i][j] != 'P') {
                    allPresent = false;
                    break;
                }
            }
            if (allPresent) {
                if (currentLen == 0) {
                    tempStart = i;
                }
                currentLen++;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    start = tempStart;
                }
            } else {
                currentLen = 0;
            }
        }

        if (maxLen == 0) {
            System.out.println("0,0");
        } else {
            System.out.println((start + 1) + "," + (start + maxLen));
        }
    }
}
