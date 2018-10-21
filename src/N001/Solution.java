package N001;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class Solution {
	
	public int[] twoSum(int []numbers,int target){
		int indices[]=new int[2];
		Hashtable<Integer, Integer>hash=new Hashtable<Integer,Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer n=hash.get(numbers[i]);
			hash.keys();
			if(n==null){
				hash.put( numbers[i],i);
			}
			n=hash.get(target-numbers[i]);
			if(n!=null&&n<i){
				indices[0]=n+1;
				indices[1]=i+1;
			}
		}
		return indices;
	}
//	public int[] twoSum(int []numbers,int target){
//		int indices[]=new int[2];
//		List<Integer> li=new ArrayList<Integer>();
//		for (int i = 0; i < numbers.length; i++) {
//			Integer n=li.indexOf(numbers[i]);
//			if(n==-1){
//				li.add(numbers[i]);
//			}
//			n=li.indexOf(target-numbers[i]);
//			if(n!=-1&&n!=i){
//				indices[0]=n;
//				indices[1]=i;
//			}
//		}
//		return indices;
//	}
//	public int[] twosum(int []numbers,int target){
//		int indices[]=new int[2];
//		for(int i:numbers){
//			int n=target-i;
//		for(int c:numbers){
//			if(c==n){
//				indices[0]=n;
// 			    indices[1]=i;
//			}
//		}
//		}
//	}
	public static void main(String[] args) {
		Solution s=new Solution();
		int []numbers;
		int target;
		int indices[]=new int[2];
		numbers=new int[]{3,2,4};
		target=6;
		indices=s.twoSum(numbers, target);
		System.out.println("index1="+indices[0]+","+"index2="+indices[1]);
	}
}
//public class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//	int[] result = new int[2];
// 
//	for (int i = 0; i < numbers.length; i++) {
//		if (map.containsKey(numbers[i])) {
//			int index = map.get(numbers[i]);
//			result[0] = index+1 ;
//			result[1] = i+1;
//			break;
//		} else {
//			map.put(target - numbers[i], i);
//		}
//	}
// 
//	return result;
//    }
//	public static void main(String[] args) {
//		Solution s=new Solution();
//		int []numbers;
//		int target;
//		int indices[]=new int[2];
//		numbers=new int[]{3,2,4};
//		target=6;
//		indices=s.twoSum(numbers, target);
//		System.out.println("index1="+indices[0]+","+"index2="+indices[1]);
//	}
//}