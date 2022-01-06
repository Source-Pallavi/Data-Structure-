public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int c=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]<A[j])
                c++;
            }
            if (c == A[i])
                return 1;
            c=0;
        }
        return -1;
    }
}
