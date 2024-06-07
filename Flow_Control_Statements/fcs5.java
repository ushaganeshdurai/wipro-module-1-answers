class fcs5{
    public static void main(String[]args){
        char c = "Laptop";
        if (Character.isLetter(c)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(c)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}