package com.xuanyb.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandom() {
		
		Calendar c = Calendar.getInstance();
		c.set(2010,10,10);
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = f.format(date);
		System.out.println(string);
	}
	
	@Test
	public void testgetInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 4, 20);
		
		Date date = DateUtil.getInitMonth(c.getTime());
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fm = f.format(date);
		System.out.println(fm);
	}
	
	@Test
	public void testgetEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 4, 20);
		Date date = DateUtil.getEndMonth(c.getTime());
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fm = f.format(date);
		System.out.println(fm);
	}
	
	@Test
	public void testgetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 3, 23);
		int year = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(year);
	}
	
	

}
