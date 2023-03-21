package dec01;

public class Reversearray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,60};
		int n=arr.length;
	int	i=0;
	int	j=n-1;
		while(i<j) 
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			///System.out.print(arr[i]);
		}
		for(int i1=0;i1<n;i1++) 
		{
			System.out.println(arr[i1]);
		}
	}
}
