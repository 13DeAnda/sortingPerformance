package sorting;

public class HeapSort {
int[]  tempArr;
int size;

public void sort(int[] arr){
    tempArr=arr;
    size=arr.length-1;
    
    
    while(size>0){
        makeHeap(size);     
        size--;//removes last (biggest) element.
    }
}

//makes the whole heap of the array
public void makeHeap(int s){
    for(int i=size;i>0;i--){
        heap(i);
    }
    //change the top element position
    swap(0,size);
}

//makes a heap between 3 elements
public void heap(int index){
    int left=2*index+1;
    int right=2*index;
    
    
    //if there is a right and left
    if(right<= size){
        if(left<= size){
           //check which of the three is the biggest and swap if necessary
           //right>left
            if(tempArr[right]>tempArr[left]){
                if(tempArr[right]>tempArr[index]){
                    swap(right,index);
                }
            }
            //left>right
            else
                if(tempArr[left]>tempArr[index])
                    swap(left,index);                 
        }    
        //there is no right but there's left
        if(tempArr[left]>tempArr[index])
            swap(left,index);
    }
        
    
}

//swaps two element position
public void swap(int i,int j){
    int temp=tempArr[i];
    tempArr[i]=tempArr[j];
    tempArr[j]=temp;
}

}
