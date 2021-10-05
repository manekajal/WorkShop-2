package com.bl;

import java.util.Scanner;

public class TicTacToeGame {
    static String user;
    static String computer;
    static char[] board = new char[10];

    static public char[] assign() {


        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';

        }
        return board;

    }
    static public void createUser() {
        Scanner scan =new Scanner(System.in);
        System.out.println(" Please choose between X or O :");

        System.out.println(" Enter X or O :");
        String user= scan.nextLine();


        if(user.equals("X")){

            computer="O";
            user="X";
        }else{
            user="X";
            computer="O";

        }
    }

    public static void main(String[] args){
          assign();
          createUser();

        System.out.println(user);
        System.out.println(computer);
    }
}
