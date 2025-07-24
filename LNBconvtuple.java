import java.util.*;

public class LNBconvtuple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a tuple (comma separated values): ");
        String tupleInput = scanner.nextLine();
        String[] tupleArray = tupleInput.split(",");
        
        System.out.print("Enter a string to add to each element: ");
        String str = scanner.nextLine();
        
        ArrayList<String> dynamicArray = new ArrayList<>();
        
        for (String element : tupleArray) {
            dynamicArray.add(element.trim() + str);
        }
        
        Object[] resultArray = dynamicArray.toArray();
        Tuple resultTuple = new Tuple(resultArray);
        
        System.out.println("Resulting tuple: " + resultTuple);
    }
}

class Tuple {
    private Object[] elements;

    public Tuple(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
