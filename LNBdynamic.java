import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LNBdynamic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> L1 = new ArrayList<>();
        System.out.println("Enter elements for L1 (enter non-integer to stop):");
        while (scanner.hasNextInt()) {
            L1.add(scanner.nextInt());
        }
        scanner.nextLine();

        List<Integer> L2 = new ArrayList<>();
        System.out.println("Enter elements for L2 (enter non-integer to stop):");
        while (scanner.hasNextInt()) {
            L2.add(scanner.nextInt());
        }
        scanner.nextLine();

        List<Integer> L3 = new ArrayList<>();

        for (int i = 0; i < L1.size(); i++) {
            if (i % 2 != 0) {
                L3.add(L1.get(i));
            }
        }

        for (int i = 0; i < L2.size(); i++) {
            if (i % 2 == 0) {
                L3.add(L2.get(i));
            }
        }

        System.out.println("L3=" + L3);

        scanner.close();
    }
}
