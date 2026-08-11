class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean r[][]=new boolean[9][9];
        boolean c[][]=new boolean[9][9];
        boolean b[][]=new boolean[9][9];
    
        int n=board.length;
        int val;
        int a;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.')continue;
                val= (board[i][j]-'1');
                a=(i/3)*3+j/3;
                if(r[i][val]||c[j][val]||b[a][val])return false;

                r[i][val]=true;
                c[j][val]=true;
                b[a][val]=true;
            }
        }
        return true;
    }
}
