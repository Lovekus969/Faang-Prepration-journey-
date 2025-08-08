
public class Prob{
      public static int countSolutions(char[][] board, int row) {
        if (row == board.length) {
            return 1; // found one valid board
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += countSolutions(board, row + 1); // recursive count
                board[row][col] = 'X'; // backtrack
            }
        }

        return count;
    }

    // This is the function you call for any size N
    public static int countNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        return countSolutions(board, 0);
    }

    //lets make the function names as the is sFE IF IT  IS SO then only place those queens otherwise no 
    public static boolean isSafe(char board[][], int row, int col){
    
        //cheack the vertical let say its at the position i,j  so i -- always j remain the same 
            for( int i=row-1; i>=0;i--){
               if(board[i][col]=='Q'){
                return false;
               }
            }
        //cheack the diagonally up left and up right  this time the row will be minus and the colum also 
        for( int i=row-1,j=col-1; i>=0 && j>=0 ; i--, j--){
                if( board[i][j] =='Q'){
                    return false;
                }
        }
        // cheack the diagonally right where we can see the rows gonna to be minus and colum gonna be increses one by on e
        for( int i =row-1, j = col+1; i>= 0 && j< board.length; i-- , j++){
            if( board[i][j]=='Q'){
                return false;
            }
        }
             
        return true;

    }
    public static void printBoard( char board[][]){
        System.out.print("---------Kush Chess Board -----");
        System.out.println();
        for( int i=0; i<board.length; i++){
            for( int j=0; j<board.length;j++){
               System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    // lets create the function named as the nqueen in which we will place the wueen in such a way for every row

    public static void nQueen(char board[][], int row){
        // let see the base case first and i know when the row reaches  to the end weneed to display the entire board 
        if( board.length==row){
            printBoard(board);
            return;
        }

        //so far so good we done the base case and printing now we need to perform some recusion and backtracking 
        
            for( int col=0 ; col<board.length; col++){
                if( isSafe(board, row,col)){

                    board[row][col] = 'Q';
                    nQueen(board, row+1);
                    board[row][col] = 'X'; // here we perform the backtracking 

                }
            
        }
    }


    public static void main(String[] args) {
        int n =10;
       
        int totalWays = countNQueens(n);
        System.out.println("Total ways to place " + n + " queens: " + totalWays);
    

    }
}