package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	public int search(int [] arr, int target) {
		// TODO Auto-generated constructor stub
		int min = 0;
		int max = arr.length - 1;
		while (min <= max) {
			int mid = (min + max)/2;
			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				max = mid - 1;
			} else {
				min = mid + 1;
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
