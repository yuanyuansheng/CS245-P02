package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {
	
	//Helper method
	public static int search(int [] arr, int min, int max, int target) {
		// TODO Auto-generated constructor stub
		int mid = (min + max) / 2;
		if (max < min) {
			return -1;
		}
		if (target == arr[mid]) {
			return mid;
		} else if(target < arr[mid]) {
			return search(arr, min, mid-1, target);
		} else {
			return search(arr, mid+1, max, target);
		}
	}
	
	public int search(int [] arr, int target) {
		return search(arr, 0, arr.length - 1, target);
	}

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return null;
	}

}
