package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;
public class StringHelperTest {
	StringHelper helper = new StringHelper();
	@Test
	public void test1() 
	{
		String expected = "CD";
		assertEquals(expected, helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void test2()
	{
		String expected = "CD";
		assertEquals(expected, helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void test3()
	{
		String expected = "CDEF";
		assertEquals(expected, helper.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void test4()
	{
		String expected = "CDAA";
		assertEquals(expected, helper.truncateAInFirst2Positions("CDAA"));
	}
	@Test
	public void test5()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void test6()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void test7()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	@Test
	public void test8()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
