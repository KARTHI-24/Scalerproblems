package dec03;

public class EqulibriumIndex {
	public static int[] prefixarraysopti(int []a)
	{
		int n=a.length;
		  int ps[]=new int[n];
		  ps[0]=a[0];
		  for(int i=1;i<n;i++) 
		  {
			  ps[i]=ps[i-1]+a[i];
		  }
		return ps;
	}
	public static int solve(int[]a) 
	{
		int answ[]=prefixarraysopti(a);
		int n=a.length;
		int index=0;
		for(int i=0;i<n;i++) 
		{
			int ls=0;
			if(i>0) 
			{
				ls=answ[i-1];
			}
			int rs=answ[n-1]-answ[i];
			if(ls==rs) 
			{
			
			index =i;	
			}
		}
		return index;
	}
	public static void main(String[] args) {
	 int a[]= {3,-1,4,5,7,-1};
       int ans=solve(a);
       System.out.println(ans);
	}

}
