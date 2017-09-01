package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	public int search(int [] arr, int target) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

}
