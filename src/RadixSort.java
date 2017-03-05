import java.util.Arrays;

/**
 * Created by tao on 17-3-5.
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] a = {55,90,11,33,32,54,94,2,464,58,45,61,49,1,5,45,22};
        System.out.println("-------------------------");
        radixSort(a, 100 );
        print(a,0);
    }
    private static void radixSort(int[] array,int d)
    {
        int n=1;//代表位数对应的数：1,10,100...
        int k=0;//保存每一位排序后的结果用于下一位的排序输入
        int length=array.length;
        int[][] bucket=new int[10][length];//排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
        int[] order=new int[length];//用于保存每个桶里有多少个数字
        while(n<d)
        {
            for(int num:array) //将数组array里的每个数字放在相应的桶里
            {
                int digit=(num/n)%10;
                bucket[digit][order[digit]]=num;
                order[digit]++;
            }
            for(int i=0;i<length;i++)//将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
            {
                if(order[i]!=0)//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                {
                    for(int j=0;j<order[i];j++)
                    {
                        array[k]=bucket[i][j];
                        k++;
                    }
                }
                order[i]=0;//将桶里计数器置0，用于下一次位排序
            }
            n*=10;
            k=0;//将k置0，用于下一轮保存位排序结果
        }

    }
    /*
    * 8.基数排序  稳定的排序算法
    * array    代表数组
    * radix    代表基数
    * d        代表排序元素的位数
    */
    public static void sort(Integer []array, int radix, int d){
        // 临时数组
        Integer[] tempArray = new Integer[array.length];
        // count用于记录待排序元素的信息,用来表示该位是i的数的个数
        Integer[] count = new Integer[radix];

        int rate = 1;
        for (int i = 0; i < d; i++) {
            //重置count数组，开始统计下一个关键字
            Arrays.fill(count, 0);
            //将array中的元素完全复制到tempArray数组中
            System.arraycopy(array, 0, tempArray, 0, array.length);

            //计算每个待排序数据的子关键字
            for (int j = 0; j < array.length; j++) {
                int subKey = (tempArray[j] / rate) % radix;
                count[subKey]++;
            }
            //统计count数组的前j位（包含j）共有多少个数
            for (int j = 1; j < radix; j++) {
                count[j] = count[j] + count[j - 1];
            }
            //按子关键字对指定的数据进行排序 ，因为开始是从前往后放，现在从后忘前读取，保证基数排序的稳定性
            for (int m = array.length - 1; m >= 0; m--) {
                int subKey = (tempArray[m] / rate) % radix;
                array[--count[subKey]] = tempArray[m]; //插入到第--count[subKey]位，因为数组下标从0开始
            }
            rate *= radix;//前进一位
            System.out.print("第" + (i+1) + "次：");
            print(array);
        }
    }
    //输出数组===============
    public static void print(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public static void print (int[] a,int i) {
        System.out.print(i + ":");
        for (int b = 0; b < a.length; b++){
            System.out.print(a[b] + "  ");
        }
        System.out.println();    }
}
