public class GameBoard { 
    private Space[][] board; 
    
    /** 
     * Returns the point value of the row in board specified by the
     * parameter. The point value is the sum of the points in the row,
     * or two times the sum of the points in the row if all spaces in 
     * the row are the same color. 
     * Preconditions: No elements of board are null.
     *                board has at least two rows and 
     *                at least two columns. targetRow is a valid row index. 
     */
    public int getPointsForRow(int targetRow) { 
        int points = board[targetRow][0].getPoints();
        String color = board[targetRow][0].getColor();
        boolean same = true;
        for(int i = 1; i < board[targetRow].length; i++){
            if(!color.equals(board[targetRow][i].getColor())){
                same = false;
            }
            points += board[targetRow][i].getPoints();
        }
        if(same){
            points *= 2;
        }
        return points;
    } 
    
    /* There may be instance variables, constructors, and methods that are not shown. */ 
}
