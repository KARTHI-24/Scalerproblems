package dec01;

public class CountValueGreat {
	public static int countgreaterele(int []arr,int n) 
	{
		int max=arr[0];
		for(int i=1;i<n;i++) 
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		int asn=0;
		int c=0;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]==max) 
			{
				c++;
			}
		}
		asn=n-c;
		
		return asn;
	}

	public static void main(String[] args) {
		int arr[]= {3,5,6,7,2,6,8,1,4,8,4};
		int n=arr.length;
		int answ=countgreaterele(arr,n);
		System.out.println(answ);
		
	}

}
