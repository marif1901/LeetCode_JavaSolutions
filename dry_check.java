
public class dry_check {

	public  void maxheapify(int A[], int n , int largest) {
		int i =largest;
		int l = 2*largest;
		int r= 2*largest +1;
		if(largest < n && A[l] > A[largest])
			largest =l;
		if(largest < n && A[r] > A[largest])
			largest =r;
		if(largest != i)
		{
			//swap(A, i, largest);
			int swp= A[largest];
			A[largest]= A[i];
			A[i]= swp;
			maxheapify(A,n, largest);
		}
			
	}
	
	public static void main (String ar[]) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n =arr.length;
		dry_check hs= new dry_check();
		for (int i = n/2 -1; i>=0; i--)
		hs.maxheapify(arr, n, i);
		
	}
	
}
