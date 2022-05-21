//https://www.codingninjas.com/codestudio/problems/flood-fill-algorithm_1089687?leftPanelTab=0
public class Solution
{
    public static void helper(int[][] image, int i, int j,int oldColor, int newColor){
        
        if(i<0||i>=image.length||j<0||j>=image[0].length)
            return ;
        //not samecolor
        if(image[i][j]!=oldColor)
            return;
        //already visited
        if(image[i][j]==newColor)
            return;
        
        image[i][j]=newColor;
        
        helper(image,i-1,j,oldColor,newColor);
        helper(image,i,j-1,oldColor,newColor);
        helper(image,i+1,j,oldColor,newColor);
        helper(image,i,j+1,oldColor,newColor);
        
        
        
    }
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
       int oldColor= image[x][y];
        
        helper(image,x,y,oldColor,newColor);
        
        return image;
    }
}

