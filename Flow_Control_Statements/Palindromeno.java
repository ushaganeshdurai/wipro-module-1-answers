class Palindromeno {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int reversed = 0;
        int original = n;

        while (n > 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n = n / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}