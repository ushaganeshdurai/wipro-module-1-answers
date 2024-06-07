import java.io.*;
import java.util.Scanner;

class fcs8{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        char code = in.next().charAt(0);
        switch(code){
        case 'R':
            System.out.println("Red");break;
        case 'G':
            System.out.println("Green");break;
        case 'B':
            System.out.println("Blue");break;
        case 'W':
            System.out.println("White");break;
        case 'O':
            System.out.println("Orange");break;
        default:
            System.out.println("Invalid Code");
        }
    }
}