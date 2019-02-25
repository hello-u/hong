package algorithm;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 *              若文件初状为正序，则一趟起泡就可完成排序，排序码的比较次数为n-1，且没有记录移动，时间复杂度是O(n)
 *              若文件初态为逆序，则需要n-1趟起泡，每趟进行n-i次排序码的比较，且每次比较都移动三次，比较和移动次数均达到最大值 O(n2)
 *              起泡排序平均时间复杂度为O(n2)
 * @Author hong
 * @Date 2019/2/25 15:35
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {22, 33, 11, 2, 42, 65, 76, 86, 48, 214, 56, 34, 21, 4, 6, 1, 54};
        System.out.println("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        mathed2(arr);

        System.out.println();
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    private static void mathed1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
            for (int j = 0; j < arr.length - i - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     *  比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     *  对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     *  针对所有的元素重复以上的步骤，除了最后一个。
     *  持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    private static void mathed2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
