

public class NQueen {


    public static boolean checkRowColumnDiagonal(int i, int j, char[][] board, int len){
        boolean isRowEmpty = true;
        boolean isColumnEmpty = true;
        boolean isLeftDiagonalEmpty = true;
        boolean isRightDiagonalEmpty = true;

        //code here 

        //For Column
        for(int p = 0; p<i; p--){
            if(board[p][j] == "0"){
                isColumnEmpty = false;
            }
        }

        //For Diagonal
        for(int p = i; p>0; p--){
            for(int q = j; q<len; q++){
                if(board[p][q]){
                    
                }
            }
        }
        
        
        
        if(isRowEmpty && isColumnEmpty && isDiagonalEmpty){
            return true;
        }
        else{
            return false;
        }
    

    }
    
    public static void insertQueen(char[][] board, int i, int j, int len){
        
        if(checkRowColumnDiagonal(i, j, board, len)){
            //code here
            board[i][j] = 'Q';
            insertQueen(board, i+1, j, len);
        }
        else{
            insertQueen(board, i, j+1, len);
        }
    }


    public static void main(String[] args) {

        char[][] board = {  {'0', '0','0', '0'},
                            {'0', '0','0', '0'},
                            {'0', '0','0', '0'},
                            {'0', '0','0', '0'}
                        };
        
        

        
        
    }
    
}
