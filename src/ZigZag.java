/**
 * Created by Administrator on 2018/10/21.
 */

/**
 * 6 Zig Zag
 * https://leetcode-cn.com/problems/zigzag-conversion/submissions/
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        if (s.length()<=numRows){
            return s;
        }
        if (numRows==1){
            return s;
        }
        int numCols = s.length() / numRows;
        if ((s.length()-(s.length()/numRows)*numRows)==(numRows-1)){
            numCols++;
        }
        char[] chars = s.toCharArray();
        if (numCols>s.length())
            numCols=s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int gap=numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int index = i + j * gap;
                if (index < s.length())
                    stringBuilder.append(chars[index]);
                int index2 = index + gap - i * 2;
                if (i > 0 && index != index2) {
                    if (index2 < s.length())
                        stringBuilder.append(chars[index2]);
                }
            }
        }
        return stringBuilder.toString();
    }
}
