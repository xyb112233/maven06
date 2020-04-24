package com.xuanyb.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {


	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String path = "C:\\Users\\lenovo\\Desktop\\hello.txt";
		String textFile = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(textFile);
	}

	@Test
	public void testReadTextFileFile() {
		String path = "C:\\Users\\lenovo\\Desktop\\hello.txt";
		String textFile = StreamUtil.readTextFile(new File(path));
		System.out.println(textFile);
	}
	
	@Test
	public void testreadTextFile1() {
		String path = "C:\\Users\\lenovo\\Desktop\\hello.txt";
		String textFile = StreamUtil.readTextFile(new File(path));
		System.out.println(textFile);
	}

}
