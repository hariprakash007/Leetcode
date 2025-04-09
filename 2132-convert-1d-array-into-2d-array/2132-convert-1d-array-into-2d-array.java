class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if (m*n != original.length) return new int[][]{};

        int row = 0;
        int col = 0;
        int indexInOriginalArray = 0;

        int[][] ans = new int[m][n];

        while(row < m)
        {
            col = 0;
            while(col < n)
            {
                ans[row][col] = original[indexInOriginalArray++];
                col++;
            }
            row++;
        }
        return ans;
    }
}