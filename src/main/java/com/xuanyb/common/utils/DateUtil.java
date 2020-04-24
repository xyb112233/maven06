package com.xuanyb.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	//随机获取日期
	public static Date random(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		long t = (long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
	
	//获取月初 2020-04-01 00:00:00
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//将日设置为1
		c.set(Calendar.DAY_OF_MONTH, 1);
		//将小时设置为0
		c.set(Calendar.HOUR_OF_DAY, 0);
		//分钟
		c.set(Calendar.MINUTE,0);
		//将秒设置为0
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	//获取月末
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//先让月加1
		c.add(Calendar.MONTH, 1);
		//然后让月变成月初(调用获取月初的方法)
		Date nextinitMonth = getInitMonth(c.getTime());
		//初始化日历类
		c.setTime(nextinitMonth);
		//减去一秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	public static int getAgeByBirthday(Date  birthday) {
		Calendar c = Calendar.getInstance();
		//获取当前的日期
		int newYear = c.get(Calendar.YEAR);
		int newMonth = c.get(Calendar.MONTH);
		int newDate = c.get(Calendar.DAY_OF_MONTH);
		//获取出生的日期
		Calendar c1 = Calendar.getInstance();
		//初始化日历时间
		c1.setTime(birthday);
		int birthdayYear = c1.get(Calendar.YEAR);
		int birthdayMonth = c1.get(Calendar.MONTH);
		int birthdayDate = c1.get(Calendar.DAY_OF_MONTH);
		if(newYear<birthdayYear) {
			throw new RuntimeException("输入的日期应该小于当前日期");
		}
		int age=newYear-birthdayYear;
		if(newMonth<birthdayMonth) {
			age--;
		}
		if(newMonth==birthdayMonth && newDate<birthdayDate) {
			age--;
		}
		return age;
	}
		
	
		
	
}

