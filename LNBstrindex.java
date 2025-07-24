import java.util.Scanner;

public class LNBstrindex {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            int length = input.length();
            StringBuilder result = new StringBuilder();
            int start = length > 7 ? 0 : 1;
            for (int i = start; i < length; i += 2) {
                result.append(input.charAt(i));
            }

            System.out.println(result.toString());
        }
    }
}
