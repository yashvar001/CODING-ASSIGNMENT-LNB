import java.util.ArrayList;

public class LNBdynamicarray {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            original.add(i);
        }

        ArrayList<Integer> selected = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            selected.add(original.get(i));
        }
        for (int i = original.size() - 5; i < original.size(); i++) {
            selected.add(original.get(i));
        }

        ArrayList<Integer> squared = new ArrayList<>();
        for (int i = 0; i < selected.size(); i++) {
            int val = selected.get(i);
            squared.add(val * val);
        }

        ArrayList<Integer> part1 = new ArrayList<>(squared.subList(0, 2));
        ArrayList<Integer> part2 = new ArrayList<>(squared.subList(2, 5));
        ArrayList<Integer> part3 = new ArrayList<>(squared.subList(5, 10));

        System.out.println("Original Array: " + original);
        System.out.println("First & Last 5: " + selected);
        System.out.println("Squared Array: " + squared);
        System.out.println("Part 1 (2 elements): " + part1);
        System.out.println("Part 2 (3 elements): " + part2);
        System.out.println("Part 3 (5 elements): " + part3);
    }
}
