package dec01;

public class RotateArray {
	 static void reverse(int[] A, int start, int end) {
	        int i, j;
	        for (i = start, j = end; i < j; i++, j--) {
	            int temp = A[i];
	            A[i] = A[j];
	            A[j] = temp;
	        }
	    }
	    public static int[] solve(int[] A, int B) {
	        int n = A.length;
	        B = B % n;
	        reverse(A, 0, n - 1);
	        reverse(A, 0, B - 1);
	        reverse(A, B, n - 1);
	        return A;
	    }
	public static void main(String[] args) {
		int []A= {12,15,13,16,17,13,14};
		int b=10;
		int answ[]=solve(A,b);
		int a=A.length;
		for(int i=0;i<a;i++) 
		{
			System.out.println(answ[i]);
		}
	}

}
