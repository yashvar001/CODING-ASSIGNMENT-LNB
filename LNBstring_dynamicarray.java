import java.util.*;

public class LNBstring_dynamicarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a paragraph: ");
        String input = scanner.nextLine();
        
        String[] words = input.split("\\s+");
        ArrayList<String> dynamicArray = new ArrayList<>();
        
        for (String word : words) {
            if (word.length() > 4) {
                dynamicArray.add(word);
            }
        }
        
        System.out.println("Words with more than 4 letters: " + dynamicArray);
    }
}
