import java.util.Scanner;
public class TTTGame {
    TicTacToe game=new TicTacToe();
    char winner;

    public void startGame(){
        game.displayBoard();
        playGame();
        winner=game.getWinner();
        printMessage();
    }
    public char playGame(){
        Scanner in=new Scanner(System.in);
        int count=0;
        char turn;
        int row ,col;
        while(game.getWinner()==' ' && count<9){
            turn=game.whoseTurn();
            System.out.println(turn+"'s turn.Type row and col:");
            do{
                row=in.nextInt();
                col=in.nextInt();

            }
            while(game.getMark(row,col)!=' ');

            game.putMark(row,col);
            System.out.println(" ");
            game.displayBoard();


            count++;
            System.out.println(count+" count");

        }
        in.close();
    return 0; }
    public void printMessage(){
        if(winner=='X')
            System.out.println("X has won!");
        else if(winner=='O')
            System.out.println("O has won!");
        else
            System.out.println("It's a draw!");
    }
    public static void main(String[] args){
        TTTGame ttt=new TTTGame();
        ttt.startGame();
    }
}
