import java.util.*;
public class NaiveRodCut
{
  public int cutRod(int[] p, int n)
  {
    if(n == 0) return 0;
    //Revenue to be maximized initialized
    int q = Integer.MIN_VALUE;
    for(int i = 1; i <= n; i++)
    {
        q = Math.max(q, p[i] + cutRod(p, n- i-1));
    }
    return q;
  }

  //Main method
  public static void main(String[] args)
  {
    int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
    int n = 4;
    NaiveRodCut cutHere = new NaiveRodCut();
    System.out.println(cutHere.cutRod(p, n));
  }
}
