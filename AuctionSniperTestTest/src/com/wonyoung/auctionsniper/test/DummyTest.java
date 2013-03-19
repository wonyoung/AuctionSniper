package com.wonyoung.auctionsniper.test;

import android.test.ActivityInstrumentationTestCase2;

import com.wonyoung.auctionsniper.MainActivity;

public class DummyTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public DummyTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}
	
	public DummyTest() {
		this(MainActivity.class);
	}

	public void testProjectCreatedAndTestShouldBeTrue() {
		assertTrue("This message can not be shown.", true);
	}
}
