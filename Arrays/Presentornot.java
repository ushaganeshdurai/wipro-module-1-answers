import java.util.Scanner;
class Presentornot{
    public static void main(String[]args){
        int []arr={1,4,34,56,7};
        Scanner in = new Scanner(System.in);
        int gn=in.nextInt();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==gn){
                System.out.print(i);break;
            }else{
                continue;
            }
        }
    }
}