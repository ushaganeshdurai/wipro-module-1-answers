class fcs6{
    public static void main (String []args){
        int age=Integer.parseInt(args[1]);
    if(args[0].equals("Female")&&(age>0&&age<=58)){
        System.out.println("the percentage of interest is 8.2%");
    }
    else if(args[0].equals("Female")&&(age>=59&&age<=100)){
        System.out.println("the percentage of interest is 9.2%");
    }
    else if(args[0].equals("Male")&&(age>0&&age<=58)){
        System.out.println("the percentage of interest is 8.4%");
    }
    else if(args[0].equals("Male")&&(age>=59&&age<=100)){
        System.out.println("the percentage of interest is 10.5%");
    }

    }
}
