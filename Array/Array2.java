class Array2 {

    static void printArrayOddFw(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static void printArrayOddBw(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static void printArrayOddBwH(int[] arr) {
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static void printArrayOddFwH(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static void printArrayOddBwHm(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    static void printArrayOddFwHm(int[] arr) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 8, 2, 21};
        printArrayOddFw(arr);
        printArrayOddBw(arr);
        printArrayOddBwH(arr);
        printArrayOddBwHm(arr);
        printArrayOddFwH(arr);
        printArrayOddFwHm(arr);
    }
}
