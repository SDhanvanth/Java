package com.tictactoe;

public class Main {
    public static void main(String[] args){

        algorithm a = new algorithm();
        boolean r = true;
        while (r){
             a.show();
             a.fill_for_user();
             a.move_pc();
             r = a.checking();
        }
    }
}
