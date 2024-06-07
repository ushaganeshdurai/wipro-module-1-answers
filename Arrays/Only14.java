import java.util.Scanner;

class Only14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");
        int n = input.length;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        only14(arr, n);
    }

    public static void only14(int[] arr, int n) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}