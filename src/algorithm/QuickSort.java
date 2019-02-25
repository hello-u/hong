package algorithm;

/**
 * @ClassName QuickSort
 * @Description 快速排序
 *              基本思想：
 *                  选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,
 *                  一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 *              tips:
 *                  快速排序的时间复杂度为O(nlogn)。
 *                  当n较大时使用快排比较好，当序列基本有序时用快排反而不好。
 * @Author hong
 * @Date 2019/2/25 17:01
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {22,41,24,35,546,13414,2,14,7,55};

        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int start = 0;
        int end = arr.length-1;
        sort(arr,start,end);

        System.out.println();
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static void sort(int[] arr,int low,int high){
        int start = low;
        int end = high;
        int key = arr[low];

        while (start < end){
            //从后往前比较
            //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
            while (start < end && arr[end] >=key){
                end--;
            }
            if (arr[end] <= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            //从前往后比较
            //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
            while (start < end && arr[start] <= key){
                start++;
            }
            if (arr[start] >= key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) {
            //左边序列。第一个索引位置到关键值索引-1
            sort(arr,low,start-1);
        }
        if (end < high) {
            //右边序列。从关键值索引+1到最后一个
            sort(arr,end+1,high);
        }
    }
}
