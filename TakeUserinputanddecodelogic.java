import java.util.Scanner;

public class TakeUserinputanddecodelogic{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("The product is: " + product);

        if (product > 500) {
            System.out.println(num1 + num2);
        } else {
            System.out.println("Hello LNB code is running fine !!");
        }

        scanner.close();
    }
}

