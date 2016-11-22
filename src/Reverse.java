import sun.security.util.Length;

/**
 * 【工程】: CrackingCodingInterview 包名: PACKAGE_NAME 类名: Reverse
 * 【作者】: liuyang
 * 【时间】: 16/11/22 下午7:28
 * 【题目】: 原串翻转
 * 【内容】: 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量).给定一个
 * string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Reverse {
    public String reverseString(String iniString) {
        for (int i = 0; i < iniString.length() / 2; i++) {
            char left = iniString.charAt(i);
            char right = iniString.charAt(iniString.length() - 1 - i);
            char[] arr = iniString.toCharArray();
            arr[i] = right;
            arr[iniString.length() - 1 - i] = left;
            iniString = String.valueOf(arr);
        }
        return iniString;
    }

    public static void main(String[] args) {
        Reverse t = new Reverse();
        String str = "123456";
        System.out.println(t.reverseString(str));
    }
}