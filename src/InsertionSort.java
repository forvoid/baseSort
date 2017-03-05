/**
 * Created by tao on 17-3-4.
 */
public class InsertionSort {
    public static void sort(int[] a) {
            for (int i = 1; i < a.length; i++) {
                int currentNumber = a[i];
                int j = i - 1;

                    while (j >= 0 && a[j] > currentNumber) {
                        a[j + 1] = a[j];
                        j--;
                    }

                a[j + 1] = currentNumber;
                print(a,i);
            }


    }
    public static void print(int[] a, int i){
        System.out.print(i + ":");
        for (int b = 0; b < a.length; b++){
            System.out.print(a[b] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {55,90,11,33,32,54,94};
        sort(a);
        System.out.println("aa");
    }
}
