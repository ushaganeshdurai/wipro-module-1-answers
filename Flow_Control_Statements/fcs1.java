import java.util.Scanner;

public class fcs1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = Integer.parseInt(args[0]); 
        int n2 = Integer.parseInt(args[1]);

        int x = in.nextInt();

        if (x > 0) {
            System.out.println("Positive Number");
        } else if (x < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        System.out.println(lastDigit(n1, n2));
    }

    public static boolean lastDigit(int n1, int n2) {
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        return lastDigit1 == lastDigit2;
    }



}
