import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
    int n,flag=1;
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag=0;
                    }
                    }
        if (flag==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}