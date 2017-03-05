/**
 * Created by tao on 17-3-5.
 */
public class SelectionSort {
    public static void sort(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
//            int temp1 = Integer.MAX_VALUE;//最小值
            int temp2= i;//最小值所在的位置,便于交换
            for (int j = i; j < arg.length; j++) {
                if (arg[temp2] > arg[j]) {
                    temp2 = j;
                }
            }
            int swap =arg[i];//i位置上的值
            arg[i] = arg[temp2];
            arg[temp2] = swap;

            print(arg,i);
        }
    }

    public static void doubleSort(int[] arg) {
        int max, min ,temp;
        for (int i = 0; i < (arg.length / 2); i++) {
            max = i;
            min = i;
            for (int j = i + 1; j < arg.length - i; j++) {
                if (arg[max] < arg[j]) {
                    max = j;
                }
                if (arg[min] > arg[j]) {
                    min = j;
                }
            }
            temp = arg[i];
            arg[i] = arg[min];
            arg[min] = temp;

            temp = arg[arg.length - i -1];
            arg[arg.length - i -1] = arg[max];
            arg[max] = temp;
            print(arg, i);
        }
    }

    public static void print (int[] a,int i) {
        System.out.print(i + ":  ");
        for (int b = 0; b < a.length; b++){
            System.out.print(a[b] + "  ");
        }
        System.out.println();    }
    public static void main(String[] args) {
        int[] a = {55,90,11,33,32,54,94,2,464,58,45,61,49,1,5,45,22};
//        sort(a);
        System.out.println("-------------------------");
        doubleSort(a);
        System.out.println("aa");
    }

}
