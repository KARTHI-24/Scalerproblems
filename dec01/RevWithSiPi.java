package dec01;

public class RevWithSiPi {
	//private static final String System.out.println(revresesi(arr,si,pi);); = null;
	public static int[] revresesi(int[]arr,int si, int pi) 
	{
		int i=si;
		int j=pi;
		while(i<j) 
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60};
		int si=2;
		int pi=5;
		int []answ=revresesi(arr,si,pi);
		int n=arr.length;
	    for(int i=0;i<n;i++) 
	    {
	      System.out.println(answ[i]);
	    }
		//revresesi(arr,si,pi);
		
	}

}
