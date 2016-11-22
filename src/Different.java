/**
 * 【工程】: CrackingCodingInterview 包名: PACKAGE_NAME 类名: Different
 * 【作者】: liuyang
 * 【时间】: 16/11/20 上午11:22
 * 【题目】: 确定字符互异
 * 【内容】: 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。给定一个string iniString，请返
 * 回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】: O(n2)
 * 【空间复杂度】: O(1)
 * 【备注】:
 * 【思路】:
 *  两层循环遍历
 */

import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {
        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    /*使用额外空间
    public boolean checkDifferent(String iniString) {
        int[] map = new int[256];
        char[] arr = iniString.toCharArray();
        for(int i =0 ;i<arr.length;i++){
            map[arr[i]] = map[arr[i]]+1;
        }
        for(int i=0;i<map.length;i++){
            if(map[i]>1){
                return false;
            }
        }
        return true;
    }
    */


    public static void main(String[] args) {
        Different t = new Different();
        String iniString = "acbdbesy";
        System.out.println(t.checkDifferent(iniString));
    }
}