//COMPT DONE


package sorting;

public class QuickSort {

	int[] tempArr;

	//perform the partition steps of the array and recursebly solve it

	public void quickSortP( int low, int high){
	
	int l=low,h=high; //values to compare and swap.
	
	int pivot=l+(h-l)/2;

	
		//go through till elements are passt the pivot
		while(l<=h){		
			//till we find an element bigger than the pivot
			while(tempArr[l]<tempArr[pivot])
				l++;

			//till e find an element lower than pivot
			while(tempArr[h]>tempArr[pivot])
				h--;	
			
			//swap values and move to next element
			if(l<=h){
				swap(l,h);
				l++;  h--;
			}		

		}
			
		//do the recursion on new partitions
	    if (low < h)
	    	quickSortP(low, h);
	     
	    if (l< high)
	    	  quickSortP(l, high);
	


}

//perform teh quickSort
public void sort(int[] arr){	
	//empty or just one element 
	if(arr.length ==0)
		return;
	
	tempArr=arr; //refre
	quickSortP(0,arr.length-1);
}

//swaps two positions 
public void swap(int i, int j){
int temp=tempArr[i];
tempArr[i]=tempArr[j];
tempArr[j]=temp;
}

}
