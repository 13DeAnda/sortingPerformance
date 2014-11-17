//COMPT DONE
package sorting;
 
public class BubbleSort {
	int[] tempArr;
	public void sort(int[] arr){
	tempArr=arr;
	int i,j;
	
	for(i=arr.length-1; i>0;i--){
		for(j=0;j<i;j++){
			if(arr[j]>arr[j+1]){
				swap(j,j+1);
			}
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

