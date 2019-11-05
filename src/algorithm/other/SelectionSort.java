package algorithm.other;

/**
 * @ClassName SelectionSort
 * @Description 简单选择排序
 *               基本思想：
 *                  在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 *                  然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * @Author hong
 * @Date 2019/2/25 17:30
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {22,41,24,35,546,13414,2,14,7,55};

        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sort(arr);

        System.out.println();
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr){
        for (int i = 0;i < arr.length;i++){
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1;j<arr.length;j++){
                //找出最小值
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //将最小值和循环体的第一互换
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
