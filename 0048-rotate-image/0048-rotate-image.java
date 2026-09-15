class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length;      // rows
        int n = matrix[0].length;  // columns


    //   transpose of matrix
        for(int i=0; i<m; i++){
            for(int j=i+1; j<n; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }

     // reversing the matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

    }
}