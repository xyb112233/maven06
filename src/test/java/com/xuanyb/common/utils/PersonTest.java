package com.xuanyb.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 1; i <= 10000; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			Date date = DateUtil.random(c.getTime(),new Date());
			//SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			//String string = f.format(date);
			
			p.setCteated(date);
			System.out.println("第"+i+"个"+p);
		}
	}

}
