package algorithm.LeeCode;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * @ClassName: 无重复字符的最长子串
 * @author: yihong
 * @since: 2019/10/25 10:33
 */
public class 无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        int start = 0;
        int end = 0;
        char[] strs = s.toCharArray();
        for (int i = 0; i < strs.length; i++) {

        }

        return max;
    }
}
