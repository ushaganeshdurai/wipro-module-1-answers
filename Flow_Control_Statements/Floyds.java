class Floyds{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    if (args.length==0){
        System.out.println("Please enter an integer number");
    }else{
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                }
                System.out.println();
                }
    }
    }
}