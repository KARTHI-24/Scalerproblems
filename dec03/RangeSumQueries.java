package dec03;



public class RangeSumQueries {
       public static void sumQueries(int []a,int [][]queries) 
       {
    	 int n=queries.length;
    	 for(int i=0;i<n;i++) 
    	 {
    		 int l=queries[i][0];
    		 int r=queries[i][1];
    		 int sum=0;
    	   for(int j=l;j<=r;j++) 
    	   {
    		   sum+=a[j];
    	   }
    	   System.out.println(sum);
    	 }
       }
	public static void main(String[] args) {
		int []a= {10,20,30,40};
        int[][]queries= {{1,3},{2,2},{0,2}};
        sumQueries(a, queries);
	}

}
