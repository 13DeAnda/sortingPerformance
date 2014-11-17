//COMPT DONE
package sorting;

public class insertionSort {

	int[] tempArr; // to reference the arr
	
public void sort(int[] arr){			
	tempArr=arr;
	int i,j,curr; //most right one, the left next, the current left moving one
	
	//it's already sorted
	if(arr.length<1)
		return;
	
	//go through the elements on the list moving to the right
	for(i=1; i<arr.length;i++){
		curr=i;
	 for(j=i-1;j>-1;j--){
		 if(arr[curr]<arr[j]){
			 swap(curr,j);
			 curr--;
		 }
		 else
			 break;
	 }
		
		
		
		}
		
	}

//swaps two positions 
public void swap(int i, int j){
int temp=tempArr[i];
tempArr[i]=tempArr[j];
tempArr[j]=temp;
}

}


