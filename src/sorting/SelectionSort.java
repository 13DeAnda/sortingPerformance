//COMPT DONE

package sorting;

public class SelectionSort {

	public void sort(int[] arr){
		int inSt=0; //the starting index
		int smallest, smInd; //smalest element and it's index
		int temp;
		int i;
		
		//if just one elem it's sorted
		if(arr.length <2)
			return;
		
		//move to right
		while(inSt <arr.length){
			smallest=arr[inSt];
			smInd=inSt;
		
			//find the next smallest item
		for(i=inSt+1; i<arr.length; i++){
			if(arr[i]<smallest){
				smallest=arr[i];
				smInd=i;
			}
		}
		//switch the smallest item 
		temp=arr[inSt];
		arr[inSt]=arr[smInd];
		arr[smInd]=temp;	
		
		inSt++;//move to next item
		}
	
}
}