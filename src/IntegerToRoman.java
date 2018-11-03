/**
 * Created by liberty on 2017/7/16.
 */

/**
 * https://leetcode-cn.com/problems/integer-to-roman/
 *
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }
        int level = 1000;
        int bit = 4;
        int n = num;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int n2 = n / level;
            if (n2 > 0) {
                if (n2 < 5) {
                    if (n2 == 4) {
                        if (bit == 3) {
                            sb.append("CD");
                        } else if (bit == 2) {
                            sb.append("XL");
                        } else if (bit == 1) {
                            sb.append("IV");
                        }
                    } else {
                        int i = n2;
                        while (i > 0) {
                            if (bit == 4) {
                                sb.append("M");
                            } else if (bit == 3) {
                                sb.append("C");
                            } else if (bit == 2) {
                                sb.append("X");
                            } else if (bit == 1) {
                                sb.append("I");
                            }
                            i--;
                        }
                    }
                } else if (n2 == 5) {
                    if (bit == 3) {
                        sb.append("D");
                    } else if (bit == 2) {
                        sb.append("L");
                    } else if (bit == 1) {
                        sb.append("V");
                    }
                } else if (n2 == 9) {
                    if (bit == 3) {
                        sb.append("CM");
                    } else if (bit == 2) {
                        sb.append("XC");
                    } else if (bit == 1) {
                        sb.append("IX");
                    }
                } else {
                    int i = n2-5;
                    if (bit == 3) {
                        sb.append("D");
                    } else if (bit == 2) {
                        sb.append("L");
                    } else if (bit == 1) {
                        sb.append("V");
                    }
                    while (i > 0) {
                        if (bit == 3) {
                            sb.append("C");
                        } else if (bit == 2) {
                            sb.append("X");
                        } else if (bit == 1) {
                            sb.append("I");
                        }
                        i--;
                    }
                }
            }
            n = n % level;
            level /= 10;
            bit--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(58));
    }
}
