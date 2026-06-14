class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<board.length;i++){
            int freq[] = new int[10];
            for(int j = 0;j<board.length;j++){
                if(board[i][j] == '.') continue;
                freq[board[i][j] - '0']+=1;
            }

            for(int k = 0;k<freq.length;k++){
                if(freq[k]>1) return false;
            }
        }
        for(int i = 0;i<board.length;i++){
            int freq[] = new int[10];
            for(int j = 0;j<board.length;j++){
                if(board[j][i] == '.') continue;
                freq[board[j][i] - '0']+=1;
            }

            for(int k = 0;k<freq.length;k++){
                if(freq[k]>1) return false;
            }
        }

        for(int boxRow = 0;boxRow<3;boxRow++){
            for(int boxCol = 0;boxCol<3;boxCol++){
                int freq[] = new int[10];
                for(int i = 0;i<3;i++){
                    for(int j = 0;j<3;j++){
                        if(board[boxRow*3 + i][boxCol*3 + j] == '.')
                        continue;
                        freq[board[boxRow*3 + i][boxCol*3 + j]-'0']+=1;
                    }
                }
                 for(int k = 0;k<freq.length;k++){
                if(freq[k]>1) return false;
            }
            }
        }
    return true;
    }
}
