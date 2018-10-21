package FactorialTrailingZeroes;


public class Solution {
//	public int trailingZeroes(Integer n) {
//		if(n!=0){
//		int count=(int)(Math.log10(n)+1);
//		int m=n.numberOfTrailingZeros(count);
//		return m;
//		}
//		else return 1;
//    }
	public int trailingZeroes(long n) {
		int count=String.valueOf(n).length();
		int i=String.valueOf(n).indexOf(48)+1;
		return  (count-i+1);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Integer n=0;
		System.out.println(new Solution().trailingZeroes(n));
	}

}
