package dec03;

//import java.util.Iterator;

public class arryaprefixesbrutforce {
  public static int[] prefixsum(int []A) 
     {
	  int n=A.length;
	  int ps[]=new int[n];
	  for(int i=0;i<n;i++) 
	  {
		  int sum=0;
		  for(int j=0;j<=i;j++) 
		  {
			  sum=sum+A[j];		
			  ps[i]=sum;
		  }
		  
	  }
	  return ps;
     }
	public static void main(String[] args) {
          int A[]= {10,20,30,40,50};
         
          int ans[]=prefixsum(A);
         for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
