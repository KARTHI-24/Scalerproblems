package dec01;

public class Targetsumpair {
  public static int[] targetsumpair(int arr[],int k,int n) 
  {
	  int pair[]=new int [n];
	  int count=0;
	  for(int i=0;i<n;i++) 
	  {  int sum=0;
		  for(int j=0;j<n;j++) 
		  {
			 if( arr[i]+arr[j]==k) 
			 {
				  sum=i+j;			 
			 }						 
		  }
		  //count=0;
			 pair[count]=sum;
			 if(sum>0) 
			 {
				 count ++;
			 }
	  }
	  //answer pair array cotains sum of i + j when it matches output
	return pair;	 
  }
	public static void main(String[] args) {
		int arr[]= {3,8,7,6,4};
		int n=arr.length;
		int k=12;
		int answ[]=targetsumpair(arr,k,n);
		int l=answ.length;
		for(int i=0;i<l;i++) 
		{
			System.out.println(answ[i]);
		}
		

	}

}
