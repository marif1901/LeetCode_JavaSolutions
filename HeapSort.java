
public class HeapSort {

	
	public  void heapsort(int A[], int n ) {
		for(int i = n/2-1; i>=0;i--) {
			maxheapify(A,n,i);
		}
		for (int i= n-1; i >=0; i--) {
			swap(A,i ,0);
			maxheapify(A,i,0);
		}
	}
	
	 void maxheapify(int A[], int n , int largest) {
		int i =largest;
		int l = 2*largest+1;
		int r= 2*largest +2;
		
		if(l < n && A[l] > A[largest])
			largest =l;
		
		if(r < n && A[r] > A[largest])
			largest =r;
		if(largest != i)
		{
			swap(A, i, largest);
			maxheapify(A,n, largest);
		}
			
	}
	 void swap(int A[], int a, int b) {
		int swp= A[a];
		A[a]= A[b];
		A[b]= swp;
			
	}
	
	static void printArray(int A[], int n ) {
		System.out.println("Below is the Sorted Array in Increasing Order");
		for(int i =0; i < n; i++) 
			System.out.print(A[i] + " ");
		System.out.println();
			
	}
	
	public static void main (String ar[]) {
		int arr[] = {12}; 
		int n =arr.length;
		HeapSort hs= new HeapSort();
		hs.heapsort(arr, n);
		printArray(arr,n);
	}
}




