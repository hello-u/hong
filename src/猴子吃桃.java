/**
 * 猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾就多吃了一个。第二天早上又将剩下的桃子吃了一半，还是不过瘾又多
 * 吃了一个。以后每天都吃前一天剩下的一半再加一个。到第10天刚好剩一个。问猴子第一天摘了多少个桃子？
 *
 * 第 i 天为第 i+1 天 的数量加1乘2
 */
public class 猴子吃桃 {
    public static void main(String[] args) {
        int sum1 = eat1(1);
        System.out.printf("%d\n",sum1);

        int sum2 = eat2(1,1);
        System.out.printf("%d\n",sum2);

        //for循环
        int total = 1;
        for (int i = 10;i >1;i--){
             total = (1 + total)*2;
        }
        System.out.printf("%d\n",total);
    }

    //递归
    static int eat1(int x) {
        if (x == 10) {
            System.out.println("第十天了");
            return 1;
        }
        return 2 * eat1(x + 1) + 2;
    }

    //尾递归
    static int eat2(int day,int total) {
        if (day == 10) {
            return total;
        }
        return eat2(day+1,2*total+2);
    }
}
