class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];
        boolean[] seenA = new boolean[A.length+1];
        boolean[] seenB = new boolean[B.length+1];
        int count=0;

        for(int i=0; i<A.length; i++){
            seenA[A[i]] = true;
            if(seenB[A[i]]) count++;

            seenB[B[i]] = true;

            if(seenA[B[i]] && A[i]!=B[i])count++;

            //but
            if(A[i]==B[i])count++;

            C[i] = count;
        }
        return C;
    }
}