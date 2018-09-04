package com.java.basic;

public class AlgorithmDemo {

	public static void main(String[] args) {
		int num[] = { 20, 80, 100, 4, 30, 15, 58, 1 };
		int start = 0;
		int end = num.length - 1;
		InsertSort(num, start, end);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static int[] BubbleSort(int[] array) {
		int t = 0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		}
		return array;
	}
	
	public static int[] SelectSort(int[] array) {
		int t = 0;
		for(int i=0;i<array.length;i++) {
			int min = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[min]>array[j]) {
					min = j;
				}
			}
			t = array[i];
			array[i] = array[min];
			array[min] = t;
		}
		return array;
	}
	
	public static int[] InsertSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			for(int j=i;j>0;j--) {
				if(array[j]<array[j-1]) {
					int t = array[j];
					array[j] = array[j-1];
					array[j-1] = t;
				}
			}
		}
		return array;
	}
	      
	    /** 
	     * 将数组的某一段元素进行划分，小的在左边，大的在右边 
	     * @param a 
	     * @param start 
	     * @param end 
	     * @return 
	     */  
	    public static int divide(int[] a, int start, int end){  
	        //每次都以最右边的元素作为基准值  
	        int key = a[end];  
	        //start一旦等于end，就说明左右两个指针合并到了同一位置，可以结束此轮循环。  
	        while(start < end){  
	            while(start < end && a[start] <= key)  
	                //从左边开始遍历，如果比基准值小，就继续向右走  
	                start++;  
	            //上面的while循环结束时，就说明当前的a[start]的值比基准值大，应与基准值进行交换  
	            if(start < end){  
	                //交换  
	                int temp = a[start];  
	                a[start] = a[end];  
	                a[end] = temp;  
	                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值右边)，因此右边也要同时向前移动一位  
	                end--;  
	            }     
	            while(start < end && a[end] >= key)  
	                //从右边开始遍历，如果比基准值大，就继续向左走  
	                end--;  
	            //上面的while循环结束时，就说明当前的a[end]的值比基准值小，应与基准值进行交换  
	            if(start < end){  
	                //交换  
	                int temp = a[start];  
	                a[start] = a[end];  
	                a[end] = temp;  
	                //交换后，此时的那个被调换的值也同时调到了正确的位置(基准值左边)，因此左边也要同时向后移动一位  
	                start++;  
	            }     
	              
	        }  
	        //这里返回start或者end皆可，此时的start和end都为基准值所在的位置  
	        return end;  
	    }  
	  
	    /** 
	     * 排序 
	     * @param a 
	     * @param start 
	     * @param end 
	     */  
	    public static void InsertSort(int[] a, int start, int end){  
	        if(start > end){  
	            //如果只有一个元素，就不用再排下去了  
	            return;  
	        }   
	        else{  
	            //如果不止一个元素，继续划分两边递归排序下去  
	            int partition = divide(a, start, end);  
	            InsertSort(a, start, partition-1);  
	            InsertSort(a, partition+1, end);  
	        }  
	              
	    }  
	      
}
