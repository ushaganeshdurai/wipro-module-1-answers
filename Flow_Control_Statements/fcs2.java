import java.util.Scanner;

public class fcs2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        System.out.println("The given number is "+(x%2==0?" even":"odd"));

    }

}
