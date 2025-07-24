import java.util.*;

public class LNBmerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        String[] names = new String[size];
        String[] values = new String[size];
        
        System.out.println("Enter names (unique elements for the first array): ");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Enter numbers/values (for the second array): ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextLine();
        }
        
        String[] keys = new String[size];
        String[] dictionary = new String[size];
        
        for (int i = 0; i < size; i++) {
            keys[i] = names[i];
            dictionary[i] = values[i];
        }
        
        System.out.println("Merged Dictionary (keys -> values):");
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + " -> " + dictionary[i]);
        }
    }
}
