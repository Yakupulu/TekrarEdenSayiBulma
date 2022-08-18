import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 8, 8, 89, 2, 2, 6, 4};
        int[] dublicate = new int[list.length];
        int startOver = 0;


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j && list[i] == list[j])) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startOver++] = list[i];
                    }
                    break;
                }
            }
        }


        for (int i : dublicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }


    }
}
