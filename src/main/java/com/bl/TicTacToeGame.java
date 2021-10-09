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
        userMove();

    }





    public static void main(String[] args){
        assign(board);
        createUser();


        System.out.println(user);
        System.out.println(computer);

    }


}
