class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Unique array: ");
        for (int i : uniqueArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[index++] = arr[i];
            }
        }

        int[] trimmedArr = new int[index];
        System.arraycopy(uniqueArr, 0, trimmedArr, 0, index);

        return trimmedArr;
    }
}