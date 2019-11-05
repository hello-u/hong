package algorithm.LeeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * @Author hong
 * @Date 2019/2/25 11:56
 **/
public class 两数之和 {

    public int[] twoSum(int[] arr,int target){
        if (null == arr){
            return null;
        }

        int a = 0,b = 0;
        int start = 0,end = arr.length-1;
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copyArr);
        while (start < end) {
            int sum = copyArr[start] + copyArr[end];
            if (sum < target) {
                start++;
            }else if (sum > target){
                end--;
            }else {
                a = copyArr[start];
                b = copyArr[end];
                break;
            }
        }

        int[] res = new int[2];
        for (int i = 0;i < arr.length;i++){
            if (a == arr[i]){
                res[0] = i;
                break;
            }
        }
        if(a != b){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == b){
                    res[1] = i;
                    break;
                }
            }
        } else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == b && i != res[0]){
                    res[1] = i;
                    break;
                }
            }
        }

        return res;
    }


    public int[] twoSum2(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < arr.length;i++){
            int temp = target - arr[i];
            map.put(i,arr[i]);
        }
        return  null;
    }

    /**
     * 这个挺好的，机智
     * @param arr
     * @param target
     * @return
     */
    public int[] twoSum3(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i< arr.length; i++){
            int temp = target - arr[i];
            if(map.containsKey(temp)) {
                return new int[]{map.get(temp),i};
            }
            map.put(arr[i],i);
        }
        return  null;
    }
    public static void main(String[] args) {
        两数之和 instance = new 两数之和();
        int[] res = instance.twoSum3(new int[]{1, 3, 11, 23, 42, 25, 22, 5},14);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}