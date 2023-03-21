package dec06;

public class AgpairsBrut {
	static int brutforce(char[] a) 
	{
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(a[i]=='a'&& a[j]=='g')
				{
					count ++;
				}
			}
		}
		return count;
		//time commplexity-->O(n^2)
		//space complexity__>O(1)
		
	}

	public static void main(String[] args) {
		char[] c= {'a','b','g','j','a','g'};//ag pairs--->3 pairs
		int count=AgpairsBrut.brutforce(c);
		System.out.println(count);

	}

}
