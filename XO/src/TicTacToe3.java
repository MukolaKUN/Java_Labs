import java.util.Scanner;

public class TicTacToe3 {

    public static final String empty="   "; //Порожнє поле
    public static final String x = " X "; // Поле хрестика
    public static final String o = " O "; // поле нулика
    public static String player; // активний гравець

    public static final int line =3; //кількість ліній
    public static final int column = 3; // кількість стовпців
    public static final String [][] board = new String[line][column]; // Ігрова поверхня
    public static int status; // статус
    public static final int statusContiniue = 0; //статус продовження гри
    public static final int statusDraw = 1; // статус нічьї
    public static final int statusXWin = 3; // статус перемоги хрестика
    public static final int statusOWin = 2; // статус перемоги нулика

    public static Scanner in = new Scanner( System.in ); // оголошення сканера




    public static void main (String[] args){
        startgame();
        do{
            getInputPlayer();
            scanBoard();
            outputBoard();
            if (status==statusXWin){
                System.out.println("X - winner");
            }else if (status==statusOWin){
                System.out.println("O - winner");
            }else if (status==statusDraw){
                System.out.println("No one win");
            }
                player = (player==x?o:x);

        }while(status==statusContiniue);

    }
    public static void startgame(){
        for (int i=0;i<line;i++){
            for (int j=0;j<column;j++) {
                board[i][j] = empty;

            }
        }
        player=x;
        outputBoard();
    }
    public static void getInputPlayer(){

        boolean inputTrue = false;
        do{
            System.out.println("Player "+player+", please input line (1-3) and column (1-3)");
            int inputLine =in.nextInt()-1;
            int inputColumn =in.nextInt()-1;

            if (inputLine>=0 && inputLine< line && inputColumn>=0 && inputColumn <column && board[inputLine][inputColumn]==empty){
                board[inputLine][inputColumn]=player;
                inputTrue=true;
            }else {
                System.out.println("Selected accommodation ("+ (inputLine+1)+","+(inputColumn+1)+" can not be used, try again");
            }
        }
        while(!inputTrue);
    }
    public static void scanBoard(){
        String winner = winer();
        if(winner.equals(x)){
            status=statusXWin;
        }else if(winner.equals(o)){
            status=statusOWin;
        }else if(fullBoard()){
            status=statusDraw;
        }else {status=statusContiniue;}

    }
    public static boolean fullBoard(){
        for(int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                if (board[i][j]==empty){
                    return false;
                }
            }
        }
        return true;
    }
    public static String winer(){
        int countLike;
       //Перевірка співпадінь в рядок
        for(int i=0; i<line;i++){
            countLike=0;
            for(int j=0;j<column;j++){
                if(board[i][0]!=empty && board[i][0]==board[i][j]){
                    countLike++;
                }
            }
            if (countLike==3){
                return board[i][0];
            }
        }
        // Перевірка співпадінь в стовпчик
        for(int j=0; j<line;j++){
            countLike=0;
            for(int i=0;i<column;i++){
                if(board[0][j]!=empty && board[0][j]==board[i][j]){
                    countLike++;
                }
            }
            if (countLike==3){
                return board[0][j];
            }
        }
            if (board[0][0]!=empty && board[0][0]==board[1][1] && board[0][0]==board[2][2]){
            return board[0][0];
            }
            if (board[0][2]!=empty && board[0][2]==board[1][1] && board[2][0]==board[1][1]){
                return board[0][2];
            }
        return empty;
    }

    public static void outputBoard(){

        for (int i=0;i<line;i++){
            for (int j=0;j<column;j++){
                System.out.print(board[i][j]);
                if (j !=column-1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i!=line-1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }
}
