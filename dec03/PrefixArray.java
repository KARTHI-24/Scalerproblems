package dec03;

public class PrefixArray {
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
    public static void prefixarrayoptimiged(int[]a,int[][]q) 
    {
    	int []ps1 =prefixarraysopti(a);
    	int sum=0;
    	for(int i=0;i<q.length;i++) 
    	{
    		int l=q[i][0];
    		int r=q[i][1];  		
    		if(l==0) 
    		{
    			sum=ps1[r];
    		}
    		else 
    		{
    			sum=ps1[r]-ps1[l-1];
    		}
    		System.out.println(sum);
    	}   

    }
	public static void main(String[] args) {
		int [][]q= {{1,2},{2,2},{0,2}};
		int a[]= {10,20,30,40,50,60};
          prefixarrayoptimiged(a, q);
         int[]answ=prefixarraysopti(a);
         for(int i=0;i<answ.length;i++) 
         {
        	 System.out.println(answ[i]);
         }
	}

}
