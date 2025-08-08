public class Nqueen {
    public static boolean isSafe( char board[][], int row, int col){
        //cheack vertical    
        for( int i=row-1; i>=0; i--){
                if(board[i][col]=='Q'){
                    return  false;
                }
        }  
              // cheack diagonal up for both left and right
              //left 
              for(int i = row-1,j = col-1;i>=0 && j>=0 ; i--,j--){
                    if(board[i][j]=='Q'){
                        return false;
                    }
              }

              //diagonally right 
              for( int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
              }


      return true;


    }

    public static void printBoard(char board[][]){
        System.out.println("-----------------------CHESS BOARD-------------");
       for( int i=0 ; i<board.length;i++){
        for( int j=0 ; j<board.length;j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
       } 
    }

    public static void nQueen(char board[][], int row){
        // loop for the column 
        //base case 
        if(row == board.length){
            printBoard(board);
            return;
        }
        for( int j=0; j<board.length ; j++){
            // all good just place the condition here if it is safe only then the queen can place here otherwise no 
                if(isSafe(board,row,j)){

                
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'X'; // backtracing 
            }
        }

    }

    public static void main ( String[]args){
        int n =10;
        char board[][] = new char[n][n];
        //intialise 
        for( int i=0 ; i<n ;i++){
            for( int j=0; j<n;j++){
                board[i][j]= 'X';
            }
        }

        nQueen(board,0);
    }
}