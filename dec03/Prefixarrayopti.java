package dec03;

public class Prefixarrayopti {
  public static int[] prefixarrays(int a[]) 
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
	public static void main(String[] args) {
	 int a[]= {10,20,30,40,50};
	  prefixarrays(a);
	  int ans[]=prefixarrays(a);
	  for (int i = 0; i < ans.length; i++) {
		System.out.println(ans[i]);
	}
	}

}
