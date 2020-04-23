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
		c.set(2015, 10, 13);
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String string = f.format(date);
		System.out.println(string);
	}

}
