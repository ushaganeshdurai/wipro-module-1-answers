import java.util.Scanner;

public class Sumarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                ignore = true;
            } else if (array[i] == 7) {
                ignore = false;
            } else if (!ignore) {
                sum += array[i];
            }
        }

        System.out.print(+ sum);
    }
}