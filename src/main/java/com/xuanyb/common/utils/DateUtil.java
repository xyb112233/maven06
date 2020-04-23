package com.xuanyb.common.utils;

import java.util.Date;

public class DateUtil {
	
	public static Date random(Date min,Date max) {
		
		long t1 = min.getTime();
		long t2 = min.getTime();
		long t = (long) (Math.random()*(t2-t1)+t1);
		
		return new Date(t);
	}
}
