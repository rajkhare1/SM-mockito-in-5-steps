package com.raj.mockito.mockitoin5steps;

public class SomeBusinessImpl {
	private DataService dataService;
	
	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MAX_VALUE;
		for (int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}

