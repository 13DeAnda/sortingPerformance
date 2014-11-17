package sorting;

public class Testing {
	public static void main(String[] args) {
	
int[] arr={14,56,64,7,86,3,14,5,6,6,43,567,45,32,1,34,45,23,24,33,556,53,454,4,35};
HeapSort qs= new HeapSort();


System.out.println("for "+arr.length+" integer elements time elapsed with:");


//quickSort
long start = System.nanoTime();
//doing the sort
qs.sort(arr);

long elapsedTime = System.nanoTime() - start;
System.out.println("This sort "+elapsedTime+" nanoseconds");

printArray(arr);

	}

	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length;i++)
			System.out.print(" "+arr[i]);	
	}

	
}

