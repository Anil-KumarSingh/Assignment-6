import java.util.*;
class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        private  static boolean check(char[][] board,int i,int j,char ch){
            int n= board.length;
            for(int k=0;k<n;k++){
                if((board[i][k] == ch && k!=j)|| (board[k][j] == ch && k!=i))
                    return false;
            }
            int a = (i/3)*3;
            int b = (j/3)*3;
            for(int k=a;k<a+3;k++){
                for(int l=b;l<b+3;l++){
                    if((board[k][l]== ch)&& (k!=i||l!=j))
                        return false;
                }
            }
            return true;
        }
        for( i=0;i<9;i++){
            for( j=0;j<9;j++){
                char ch=board[i][j];
                if(char ch!="."){
                }
                    if(!check(board,i,j,ch)){
                        return false;
                    }
                }
            }
        }
        public static void main(String[] args){
        }
    }

