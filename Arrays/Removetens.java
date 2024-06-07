import java.util.Scanner;

class Removetens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[]input=in.nextLine().split(",");

        int[] arr = new int[input.length];
        int n = arr.length;
for(int i=0;i<n;i++){
    arr[i]=Integer.parseInt(input[i]);
}


        removeTens(arr, n);
        System.out.println("Array after removing 10's:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void removeTens(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!= 10) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
    }
}