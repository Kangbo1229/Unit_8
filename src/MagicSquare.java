/**
 * MagicSquare program is an arrangement of numbers in a square grid, that all add up to same number
 * in each row, column, and the up and down main diagonals
 * @author Elly Kang
 * @since May 24, 2020
 */
public class MagicSquare {
    private int[][] grid;

    /**
     * This begins the object
     * @param g it's a 2D array
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * It goes through each row and adds up the sum of each row
     * @param row Find sum of each row
     * @return sum
     */
    public int rowSum(int row) {
        int s = 0;
        for (int i = 0; i < grid[row].length; i++) {
            s += grid[row][i];
        }
        return s;
    }

    /**
     * It goes through each column and adds up the sum of each column
     * @param col Find sum of each column
     * @return sum
     */
    public int colSum(int col) {
        int s = 0;
        for (int i = 0; i < grid.length; i++){
            s += grid[i][col];
        }
        return s;
    }

    /**
     * It calculates sum of integers in up-diagonal
     * row starts ar row.length and goes down by one
     * column starts at 0, goes up by one
     * @return sum
     */
    public int upDiagSum() {
        int s = 0;
        int row = grid.length-1;
        int col = 0;
        for(int i =0; i<grid[0].length; i++){
            s += grid[row][col];
            row--;
            col++;
        }
        return s;
    }

    /**
     *It calculates sum of integers in down-diagonal
     * row and column numbers are the same
     * @return sum
     */
    public int downDiagSum() {
        int s = 0;
        int row = 0;
        int col = 0;
        for(int i=0; i<grid.length; i++){
            s += grid[row][col];
            row++;
            col++;
        }
        return s;
    }

    /**
     * This checks if everything is the same (row, column, and diagonals)
     * @return boolean
     */
    public boolean isMagicSquare() {
        boolean blank = true;
        for(int i=0; i<grid.length; i++) {
            int row = rowSum(i);
            int col = colSum(i);
            if (rowSum(0) != row || rowSum(0) != col || rowSum(0) != upDiagSum() || rowSum(0) != downDiagSum()) {
                blank = false;
            }
        }
        return blank;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

