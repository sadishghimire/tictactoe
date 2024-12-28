public class TicTacToe {

    char[][] board;
    char PLAYER_1='X';
    char PLAYER_2='O';
    char name;
    char turn;

    public TicTacToe(){
        this.board=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        turn=PLAYER_1;
    }
    public char getWinner(){
        //rows
        if(board[0][0] ==board[0][1] && board[0][1] ==board[0][2]){
            name=board[0][0];
        }
        else if(board[1][0] ==board[1][1] && board[1][1] ==board[1][2]){
            name=board[1][0];
        }
        else if(board[2][0] ==board[2][1] && board[2][1] ==board[2][2]){
            name=board[2][0];
        }
        //columns
        else if(board[0][0] ==board[1][0] && board[1][0] ==board[2][0]){
            name=board[0][0];
        }
        else if(board[0][1] ==board[1][1] && board[1][1] ==board[2][1]){
            name=board[0][1];
        }
        else if(board[0][2] ==board[1][2] && board[1][2] ==board[2][2]){
            name=board[0][2];
        }
        //diagonals
        else if(board[0][0] ==board[1][1] && board[1][1] ==board[2][2]){
            name=board[0][0];
        }
        else if (board[0][2] ==board[1][1] && board[1][1] ==board[2][0]){
            name=board[0][2];
        }



        return name;
    }
    public void displayBoard(){
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
        System.out.println("_____________");
        System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
        System.out.println("_____________");
        System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
    }

    public char whoseTurn(){
        if(turn==PLAYER_1){
            turn=PLAYER_1;
        }
        else{
            turn=PLAYER_2;
        }
    return turn;

    }

    public void putMark(int row ,int col){
        if(turn==PLAYER_1){
            board[row][col]=PLAYER_1;
            turn=PLAYER_2;
        }
        else{
            board[row][col]=PLAYER_2;
            turn=PLAYER_1;
        }

    }
    public char getMark(int row ,int col){
        return board[row][col];

    }

    public static void main(String[] args){
        TicTacToe tttt=new TicTacToe();


    }


}
