public class TakeUserinput {

    public static void main(String[] args) throws java.io.IOException {

        int[] numbers = new int[5];

        int validCount = 0;

        java.io.InputStreamReader reader = new java.io.InputStreamReader(System.in);

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter integer number " + (i + 1) + ": ");
                int num = 0;
                boolean validNumber = true;
                int character = reader.read();

                while (character != '\n' && character != -1) {
                    if (character >= '0' && character <= '9') {
                        num = num * 10 + (character - '0');
                    } else {
                        validNumber = false;
                        break;
                    }
                    character = reader.read();
                }

                if (validNumber) {
                    numbers[validCount] = num;
                    validCount++;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    while (character != '\n' && character != -1) {
                         character = reader.read();
                    }
                }
            }
        }

        int[] filteredNumbers = new int[validCount];
        int filteredCount = 0;

        for (int i = 0; i < validCount; i++) {
            if (numbers[i] >= 9) {
                filteredNumbers[filteredCount] = numbers[i];
                filteredCount++;
            }
        }

        int sumOfRemaining = 0;
        for (int i = 0; i < filteredCount; i++) {
            sumOfRemaining += filteredNumbers[i];
        }

        System.out.print("Original numbers: ");
        for (int i = 0; i < validCount; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Numbers greater than or equal to 9: ");
        for (int i = 0; i < filteredCount; i++) {
            System.out.print(filteredNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of remaining numbers: " + sumOfRemaining);

        reader.close();
    }
}
