package com.xuanyb.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="";
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		String str=" ";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString());
	}

	@Test
	public void testRandomChineseStringInt() {
		System.out.println(StringUtil.randomChineseString(5));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
