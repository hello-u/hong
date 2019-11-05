package algorithm.other;

/**
 * 公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，
 * 用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
 *
 */
public class 百钱百鸡 {
    public static void main(String[] args) {
        for (int x = 1;x < 20; x++) {
            for (int y = 1; y < 33; y ++) {
                int z = 100 - x - y;
                if (z%3 == 0 && (5*x + 3*y + z/3)==100) {
                    System.out.print("公鸡 ：" + x + "只,");
                    System.out.print("母鸡 ：" + y + "只,");
                    System.out.print("小鸡 ：" + z + "只");
                    System.out.println();
                }
            }
        }

        System.out.println("对结果分析后简化过程");

        /**
         * 公鸡 ：4只, 母鸡 ：18只, 小鸡 ：78只
         * 公鸡 ：8只, 母鸡 ：11只, 小鸡 ：81只
         * 公鸡 ：12只, 母鸡 ：4只, 小鸡 ：84只
         *
         * 看出规律：x为4的倍数，y为7递减，z为3递增
         * x + y + z = 100
         * 5*x + 3*y + z/3 = 100
         * 得到： 7x + 4y = 100
         * 因为x是4的倍数，设 x = 4k
         * 那么 y = 25 - 7k;
         * z = 75 + 3k
         * 因为 x > 0,y > 0，z > 0，所以  0 < K < 4
         */
        int x,y,z;
        for (int k = 1;k < 4 ;k ++) {
            x =4*k;
            y = 25 - 7*k;
            z = 75 + 3*k;
            System.out.print("公鸡 ：" + x + "只,");
            System.out.print("母鸡 ：" + y + "只,");
            System.out.print("小鸡 ：" + z + "只");
            System.out.println();
        }
    }
}
