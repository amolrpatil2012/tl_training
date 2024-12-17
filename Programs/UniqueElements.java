import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Unique elements in the array are:");
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            // Check if the current element is unique
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
