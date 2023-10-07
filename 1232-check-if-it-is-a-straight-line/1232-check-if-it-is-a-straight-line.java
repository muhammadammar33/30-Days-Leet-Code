class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];
        
        double expectedSlope = calculateSlope(point1, point2);
        
        for (int i = 2; i < coordinates.length; i++) {
            int[] currentPoint = coordinates[i];
            double currentSlope = calculateSlope(point1, currentPoint);
            
            if (currentSlope != expectedSlope) {
                return false;
            }
        }
        
        return true;
    }
    private static double calculateSlope(int[] point1, int[] point2) {
        int X = point2[0] - point1[0];
        int Y = point2[1] - point1[1];
        
        if (X == 0) {
            return Double.POSITIVE_INFINITY;
        }
        
        return (double) Y / X;
    }
}