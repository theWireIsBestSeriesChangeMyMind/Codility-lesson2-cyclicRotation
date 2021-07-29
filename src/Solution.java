public class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
//        int numberOfMoves = A.length % K == 0 ? ;
//        if (A.length % K == 0) return A;
//
//        for (int i = 0, j = A.length - 1; i < A.length % K; i++, j--) {
//
//        }
        int[] result = A;
        int i = 0;
        while (i < K) {
            result = moveLastToFirst(result);
            i++;
        }

        return result;
    }

    public int[] moveLastToFirst(int[] A) {
        int lengthIndex = A.length - 1;
        int[] copy = new int[lengthIndex];
        int[] result = new int[A.length];
        result[0] = A[lengthIndex];
        System.arraycopy(A, 0, copy, 0, lengthIndex);
        System.arraycopy(copy, 0, result, 1, lengthIndex);
        return result;
    }
}

