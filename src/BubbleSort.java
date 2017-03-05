import java.util.HashMap;

/**
 * Created by tao on 17-3-5.
 */
public class BubbleSort {
    public static void sort1(int[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp =arr[j + 1];
                    arr[j + 1] =arr[j];
                    arr[j] = tmp;
                    flag =false;
                }

            }
            print(arr, i);
            if (flag) break;
        }
    }
    public static void sort2(int[] arr) {
        int flag = arr.length - 1;
        while (flag > 0) {
            int k = flag;
            flag = 0;
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp =arr[j + 1];
                    arr[j + 1] =arr[j];
                    arr[j] = tmp;
                    flag =j ;
                }

            }

            print(arr, 0);
        }
    }

    public static void print (int[] a,int i) {
        System.out.print(i + ":  ");
        for (int b = 0; b < a.length; b++){
            System.out.print(a[b] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {55,90,11,33,32,54,94,2,464,58,45,61,49,1,5,45,22};
        System.out.println("-------------------------");
        sort2(a);
    }
}
