package com.xuanyb.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 3));
		
	}

	@Test
	public void testSubRandom() {
		
		int[] is = RandomUtil.subRandom(2, 100, 3);
		
		for (int i : is) {
			System.out.println(i);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(5);
		System.out.println(randomString);
	}

}
