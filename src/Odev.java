import java.util.Arrays;

public class Odev {
    static boolean isFİnd(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 8, 1,8,8, 3, 5, 2, 4, 2, 4};
        int[] dublicate = new int[dizi.length];
        int startDizi = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j]) {
                    if (dizi[i] % 2 == 0) {
                        if (!isFİnd(dublicate,dizi[i])) {
                            dublicate[startDizi++] = dizi[i];
                        }
                        break;
                    }
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
