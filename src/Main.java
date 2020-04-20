import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();
        occurrence(element, size, arr);
        duplicates(size, arr);
    }

    private static void occurrence(int element, int size, int[] arr) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println(i + " ");
                c++;
            }

        }
        if (c == 0) {
            System.out.println("No such element exists");
        }

    }

    private static void duplicates(int size, int[] arr) {
        Set<Integer> duplicates = new HashSet<Integer>();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                }
            }

        }
        System.out.println(duplicates.toString());
    }

}
