public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int size=A.length;
        int space =A[1]-A[0];
       for(int i=1;i<size-1;i++)
        {
            if((A[i+1]-A[i])!=space)
            return 0;
        }
        return 1;
    }
}
