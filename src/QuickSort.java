/**
 * Created by tao on 17-3-5.
 */
public class QuickSort {
    static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }

    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }

    public static void sort(int[] a ) {
        quicksort(a , 0, a.length -1);
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
        sort(a);
        print(a, 0);
    }
}
