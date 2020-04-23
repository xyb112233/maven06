package com.xuanyb.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数
 * @author: lenovo
 * @date: 2020年4月23日 上午10:40:21
 */
public class RandomUtil {
	
	public static int random(int min,int max) {
		Random r = new Random();
		
		return r.nextInt(max-min+1)+min;
	}
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
	//TODO 实现代码
		
		int[] result = new int[subs];
		//避免重复
		HashSet<Integer> set = new HashSet<Integer>();
		//用while
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		int i=0;
		for (Integer value : set) {
			result[i] =value;
			i++;
		}
		return result;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	//TODO 实现代码
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		return str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < length; i++) {
			b.append(randomCharacter());
		}
		return b.toString();
	}


}
