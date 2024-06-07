import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");
        int[] array = new int[input.length];
        int n = array.length;

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int nextEven = 0, nextOdd = array.length - 1;

        while (nextEven < nextOdd) {
            if (array[nextEven] % 2 == 0) {
                nextEven++;
            } else if (array[nextOdd] % 2 != 0) {
                nextOdd--;
            } else {
                int temp = array[nextEven];
                array[nextEven] = array[nextOdd];
                array[nextOdd] = temp;
                nextEven++;
                nextOdd--;
            }
        }

        System.out.println(java.util.Arrays.toString(array));
    }
}