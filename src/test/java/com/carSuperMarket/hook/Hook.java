package com.carSuperMarket.hook;

import com.carSuperMarket.helper.Base;

import cucumber.api.java.Before;



public class Hook extends Base 

{
	
@Before 
	
	// this method opens chrome browser
	public void setUp() throws Exception{
		
		launchBrowser("Chrome");
		
	}
	
	
	/*
	 * @After
	 * 
	 * public void tearDown() throws Exception {
	 * 
	 * closeBrowser(); }
	 */
	 

}
