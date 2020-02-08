/**
 * 179. Largest Number
 * https://leetcode-cn.com/problems/largest-number
 */

public class LargestNumber {

    static String solution(int[] input) {
        String result = null;

        StringBuilder sb = new StringBuilder();
        /**
         * 方法1
         */
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                String strI = Integer.toString(input[j]);
                String strJ = Integer.toString(input[j + 1]);
                if ((strI + strJ).compareTo(strJ + strI) < 0) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            sb.append(input[i]);
        }

        /**
         * 方法2
         */
//        String[] numStrs = new String[input.length];
//        for (int i = 0; i < input.length; i++) {
//            numStrs[i] = Integer.toString(input[i]);
//        }
//
//        Arrays.sort(numStrs, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2 + o1).compareTo((o1 + o2));
//            }
//        });

//        for (String str:numStrs
//             ) {
//            sb.append(str);
//        }

        result = sb.toString();

        if (result.charAt(0) == '0') {
            result = "0";
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testCase = new int[]{3, 30, 34, 243, 5, 9};
        String solution = solution(testCase);
        System.out.println(solution);
    }

}
