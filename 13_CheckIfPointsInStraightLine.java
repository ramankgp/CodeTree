/*
1232. Check If It Is a Straight Line
You are given an array coordinates, 
coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
*/
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 0 || coordinates.length == 1)
            return true;
        
        double slope = (coordinates[1][1] - coordinates[0][1])*1.0/(coordinates[1][0] - coordinates[0][0]);
        
        // check slope of all points from 1st point(or any other point)
        for(int i=2; i<coordinates.length; i++)
        {
            double currslope = (coordinates[i][1]-coordinates[0][1])*1.0/(coordinates[i][0]-coordinates[0][0]);
            if(currslope != slope)
                return false;
        }
        return true;
    }
}