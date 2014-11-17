package sorting;

import java.util.Random;

public class PerformanceTester {
	public static void main(String[] args) {
		int[] arr= new int[1000];
		long start;
		long bubble,heap,merge,insertion,quick,selection;
		
		
		//bubble
		BubbleSort bs= new BubbleSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		bs.sort(arr);
		bubble = System.nanoTime() - start;
		
		//heapSort
		HeapSort hs= new HeapSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		hs.sort(arr);
		heap= System.nanoTime() - start;
		
		//insertionSort
		insertionSort is= new insertionSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		is.sort(arr);
		insertion= System.nanoTime() - start;
		
		//mergeSort
		mergeSort ms= new mergeSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		//ms.sort(arr);
		merge= System.nanoTime() - start;
		
		//QuickSort
		QuickSort qs= new QuickSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		qs.sort(arr);
		quick= System.nanoTime() - start;
		
		//SelectionSort
		SelectionSort ss= new SelectionSort();
		createArray(arr);		
		//count time
		start=System.nanoTime();
		ss.sort(arr);
		selection= System.nanoTime() - start;
		
		
		System.out.println("BubbleSort time: "+bubble);
		System.out.println("HeapSort time: "+heap);
		System.out.println("insertionSort time: "+insertion);
		System.out.println("mergeSort time: "+merge);
		System.out.println("quickSort time: "+quick);
		System.out.println("SelectionSort time: "+bubble);
		System.out.println("QuickSort time: "+quick);
		
	}
	

	
	public static void createArray(int[] arr){
		Random rand = new Random();
		for(int i=0; i<arr.length; i++){
			arr[i] = rand.nextInt(1000) + 0;
		}
	}
}
