package com.calsoft.jenkintest;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app =new App();
	public void getSumTest(){
		//System.out.println("hello testing....");
		Assert.assertEquals(15,app.getSum(10,5));
	}
}
