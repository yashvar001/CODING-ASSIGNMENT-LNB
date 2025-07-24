import java.util.*;

public class LNBdynamic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter number of tuples: ");
                n = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        int[][] dynamicArray = new int[n][];

        for (int i = 0; i < n; i++) {
            boolean tupleValid = false;
            while (!tupleValid) {
                try {
                    System.out.print("Enter elements of tuple " + (i + 1) + " (comma separated): ");
                    String input = scanner.nextLine();
                    String[] tokens = input.split(",");
                    dynamicArray[i] = new int[tokens.length];
                    for (int j = 0; j < tokens.length; j++) {
                        dynamicArray[i][j] = Integer.parseInt(tokens[j].trim());
                    }
                    tupleValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid integers for the tuple.");
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] tuple1 = dynamicArray[i];
                int[] tuple2 = dynamicArray[j];
                if (tuple1.length > tuple2.length ||
                    (tuple1.length == tuple2.length && sumOfTuple(tuple1) > sumOfTuple(tuple2)) ||
                    (tuple1.length == tuple2.length && sumOfTuple(tuple1) == sumOfTuple(tuple2) && tuple1[0] > tuple2[0])) {
                    dynamicArray[i] = tuple2;
                    dynamicArray[j] = tuple1;
                }
            }
        }

        System.out.println("New dynamic array: ");
        for (int[] tuple : dynamicArray) {
            System.out.print("[");
            for (int i = 0; i < tuple.length; i++) {
                System.out.print(tuple[i]);
                if (i < tuple.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int sumOfTuple(int[] tuple) {
        int sum = 0;
        for (int num : tuple) {
            sum += num;
        }
        return sum;
    }
}
