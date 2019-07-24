//Bootom up Approach rod cutting
public class MemoizedSolution
{
  public int[] memoizedCutRod(int[] p, int n)
  {
    int[] c = new int[n+1];     //The Look up array
    c[0] = 0;             //No revenue for length 0
    int curr = 0;
    for(int i = 1; i <= n; i++)        //Keeps track of the length as index to the memoization array
    {
      for(int k = 1; k <= i; k++)       //k is the first cut place
      {
          c[i] = Math.max( p[k-1] + c[i - k], curr);
          curr = c[i];
      }
    }
    return c;
  }

  public static void main(String[] args)
  {
     int[] p = {1, 5, 8, 9, 10, 17, 17, 20};
     int n = 4;
     MemoizedSolution cal = new MemoizedSolution();
     int[] resArr = cal.memoizedCutRod(p, n);
     System.out.println(resArr[4]);
  }
}


//Output -10
