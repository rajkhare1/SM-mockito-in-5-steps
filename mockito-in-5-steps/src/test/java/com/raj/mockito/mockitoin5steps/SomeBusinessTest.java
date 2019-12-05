package com.raj.mockito.mockitoin5steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24,6,15};
	}
	
}
