class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int n = mat.length;

        for (int r = 0; r < 4; r++) {

            // Check if mat == target
            boolean same = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        same = false;
                        break;
                    }
                }
            }

            if (same) {
                return true;
            }

            // Rotate 90° clockwise
            int[][] temp = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[j][n - 1 - i] = mat[i][j];
                }
            }

            mat = temp;
        }

        return false;
    }
}