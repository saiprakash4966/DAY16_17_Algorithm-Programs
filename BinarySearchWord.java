package com.bl;

public class BinarySearchWord
{
	 

			/**
			 * Returns index of search if it is present in arr[], else return -1
			 * 
			 * @param arr  -array of a string
			 * @param srch -searching element in the array
			 * @return
			 */
			static int binarySearch(String[] arr, String search) 
			{
				/**
				 * array value should start with zero and ends with arr.length-1 taking l for
				 * lower index of array at initial position and r is the higher index of the
				 * array it should be one value less than array's length
				 */
				int a = 0, b = arr.length - 1;

				/**
				 * taking while loop for checking condition like l value should less than or
				 * equal to r
				 * 
				 */
				while (a <= b) {

					/**
					 * this formula is taking for mid point in the array represents 'm'
					 */
					
					int c = (a + b)/2;
					int x = search.compareTo(arr[c]);

					/*
					 * Check if search value is present at mid
					 */
					if (a == 0)
						return c;

					/*
					 * If search value greater than midpoint value then ignore the left half
					 */
					if ( a> 0)
						a = c + 1;

					/*
					 * If search value is smaller than midpoint ignore the right half
					 */
					else
						b = c - 1;
				}
				/**
				 * else return -1 to print element is not found
				 */
				return -1;
			}

			/**
			 * Main method for manipulation linkedList
			 * 
			 * @param args  - Default Java param (Not used)
			 */
			public static void main(String[] args)
			{
				String[] arr = { "Delhi", "Karnataka", "Kerala", "Noida" };
				String x = "ss";

				int result = binarySearch(arr, x);

				if (result == -1)
					System.out.println("Element not present");
				else
					System.out.println("Element found at " + "index " + result);
			}
		}


