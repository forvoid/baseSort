/**
 * Created by tao on 17-3-5.
 */
public class ShellSort {
    public static void sort(int[] arg) {
       //先计算步长
        int len = 1;
        while (len <= arg.length / 3) {
            len = len * 3 + 1;
        }
        while ( len > 0) {
            for (int i = len; i < arg.length; i += len) {
//                if (arg[i] < arg[i-len]) {
                    int temp = arg[i];
                    int j = i - len;
                    while (j >= 0 && temp < arg[j]) {
                        arg[j + len] = arg[j];
                        j -= len;
                    }
                    arg[j + len] = temp;
                    print(arg, i);
//                }

            }
            len = (len - 1) ;
        }
    }
    public static void print (int[] a,int i) {
        System.out.print(i + ":");
        for (int b = 0; b < a.length; b++){
            System.out.print(a[b] + "  ");
        }
        System.out.println();    }
    public static void main(String[] args) {
        int[] a = {55,90,11,33,32,54,94,2,464,58,45,61,49,1,5,45,22};
        sort(a);
        System.out.println("aa");
    }
}
