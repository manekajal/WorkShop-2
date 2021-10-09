package com.bl;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    static char user;
    static char computer;
    static char[] board = new char[10];
    char userMark;
    char computerMark;

    static public void assign(char[] board) {


        for (int i = 1; i < board.length-1; i++) {

            board [i]  = ' ';

        }
        System.out.println();


    }



    static public void createUser() {
        Scanner scan = new Scanner(System.in);

       System.out.println( " Select Your Marker (O or X): ");
        char user=scan.next().charAt(0);


        if (user == 'X')
        {

            computer = 'O';


        } else {

            computer = 'X';

        }


    }
    public static void showBoard(char[] board){

        System.out.println("---------------");
        System.out.println(  TicTacToeGame.board[1]+ "|"+ TicTacToeGame.board[2]+ "|"+ TicTacToeGame.board[3]);
        System.out.println( TicTacToeGame.board[4]+ "|"+ TicTacToeGame.board[5]+"|"+ TicTacToeGame.board[6]);
        System.out.println( TicTacToeGame.board[7]+ "|"+ TicTacToeGame.board[8]+"|"+ TicTacToeGame.board[9]);

    }
    public static void tossGame(){
        if(Math.random()<0.5){
            System.out.println("user");
        }else
        {
            System.out.println("computer");
        }
    }
    public static void playGame() {
        Scanner scan = new Scanner(System.in);

        char input;
        for(int i=1;i< board.length-1;i++)
        {
            System.out.print(user+" Turn: ");
            input=scan.next().charAt(0);
            replace(board,input,user);
            assign(board);
            System.out.print(computer+" Turn: ");
            input=scan.next().charAt(0);
            replace(board,input,computer);
            assign(board);
            showBoard(board);

        }

    }
    private static void replace(char[] arr, char find, char replace) {

        for(int i=1; i<board.length;i++){
            if(arr[i]== find){
                arr[i]=replace;
                return;
            }
        }
    }
    public static boolean checkForWin() {
        return (checkForRow() || checkForColomn() || checkForDiagnol());
    }



    public static boolean checkForRow() {
        for(int i=1; i< board.length; i++)
        {
            if(check(board[i],board[i], board[i])==true)
                return true;
        }
        return false;
    }

    public static boolean checkForColomn() {
        for(int i=1; i< board.length; i++)
        {
            if(check(board[i],board[i], board[i])==true)
                return true;
        }
        return false;
    }

    public static boolean checkForDiagnol()
    {
        return ( (check(board[1], board[2], board[3])) || (check (board[1],board[2], board[3])==true));
    }

    public static boolean check(char c1, char c2, char c3)
    {
        return((c1==c2) && (c2==c3));
    }




    public static void main(String[] args){
        tossGame();

        createUser();
      playGame();
      checkForWin();


        System.out.println(user);
        System.out.println(computer);

    }


}
