class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }
        
        if (n % 2 == 1) {
            int middleIndex = n / 2;
            sum -= mat[middleIndex][middleIndex];
        }
        
        return sum;
    }
}