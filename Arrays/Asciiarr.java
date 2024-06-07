public class Asciiarr {
    public static void main(String[] args) {
        int[] asciiValues = {65, 66, 67, 68, 69}; 

        for (int i = 0; i < asciiValues.length; i++) {
            char c = (char) asciiValues[i]; 
            System.out.print(c + " "); 
        }
    }
}