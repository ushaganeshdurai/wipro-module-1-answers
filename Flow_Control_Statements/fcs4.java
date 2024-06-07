import java.io.*;
import java.util.Scanner;
class fcs4{
    public static void main(String[]args){
        char c1,c2;
        Scanner in = new Scanner(System.in);
        c1=in.next().charAt(0);
        c2=in.next().charAt(0);
    if(c1>c2){
        System.out.println(c2+","+c1);
    }else{
        System.out.println(c1+","+c2);
    }

    }
}