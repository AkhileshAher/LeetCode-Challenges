class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] position = new int[m * n + 1][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                position[mat[i][j]][0] = i;
                position[mat[i][j]][1] = j;
            }
        }
        
        int[] rowPaint = new int[m];
        int[] colPaint = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int r = position[num][0];
            int c = position[num][1];
            
            rowPaint[r]++;
            colPaint[c]++;
            
            if (rowPaint[r] == n || colPaint[c] == m) {
                return i;
            }
        }
        
        return -1;
    }
}
