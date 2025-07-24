import java.util.Scanner;

public class LNBcatndog {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine().toLowerCase();
            int catCount = 0, dogCount = 0;

            for (int i = 0; i <= input.length() - 3; i++) {
                String sub = input.substring(i, i + 3);
                if (sub.equals("cat")) {
                    catCount++;
                } else if (sub.equals("dog")) {
                    dogCount++;
                }
            }

            System.out.println(catCount == dogCount);
        }
    }
}
