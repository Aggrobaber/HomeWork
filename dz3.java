import java.util.Arrays;

/**
 * Java2 HomeWork#3
 *
 * @author Vladimir Gomenyuk
 * @version 14.12.2021
 */

public class dz3 {
    public static void main(String[] args) {
        workingWithArrays();
        creatingAnArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(creatingAnArrayByParameters(8, 7)));
    }


    private static void workingWithArrays() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void creatingAnArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = 1 + i;
        }
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println("\n");
    }

    private static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println("\n");
    }

    private static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] creatingAnArrayByParameters(int len, int initialValue) {
        int[] arr =new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i]=initialValue;
        }return arr;

    }

}
