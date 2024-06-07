import java.util.Scanner;

class Midway {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input1 = in.nextLine().split(",");
        String[] input2 = in.nextLine().split(",");
        int n1 = 3;
        int n2 = 3;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        int[] res = new int[2];
        midway(arr1, arr2, n1, n2, res);
        System.out.print(res[0] + ", " + res[1]);
    }

    public static void midway(int[] arr1, int[] arr2, int n1, int n2, int[] res) {
        res[0] = arr1[1];
        res[1] = arr2[1];
    }
}