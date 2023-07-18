package com.tictactoe;

import java.util.Scanner;

public class algorithm {            // creating a class

    int[][] common_board = new int[3][3]; // creating 3x3 array

    final int user_input = 2;
    final int pc_input = 1;     // 0 is for the place not filled

    public int[] find_position() {           // method to find the position in the array for the given input

        int[] rc = new int[2];   // creating a array to store row and column value
        int row = 0, column = 0;  // defining value

        System.out.print("Enter the position:"); // for input
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        if (value > 9) {
            System.out.println("Give number between 1 to 9");
            find_position();
        }

        switch (value) {       // giving the row and column based on user input

            case 1:
                row = 0;
                column = 0;
                break;

            case 2:
                row = 0;
                column = 1;
                break;

            case 3:
                row = 0;
                column = 2;
                break;

            case 4:
                row = 1;
                column = 0;
                break;

            case 5:
                row = 1;
                column = 1;
                break;

            case 6:
                row = 1;
                column = 2;
                break;

            case 7:
                row = 2;
                column = 0;
                break;

            case 8:
                row = 2;
                column = 1;
                break;

            case 9:
                row = 2;
                column = 2;
                break;
        }

        rc[0] = row;    // adding value to array rc
        rc[1] = column;

        return rc;
    }

    public void fill_for_user() {         // filling the array based on user input
        // setting value for the input for reading for pc

        int[] x = find_position();
        if (common_board[x[0]][x[1]] == 0) {
            common_board[x[0]][x[1]] = user_input;
        }
        else {
            System.out.println("place is already occupied");
            fill_for_user();
        }
    }

    public int[] check_row() {      //row checking to block user move

        int[] chrow = new int[9];

        // type casting to bool to int and checking condition
        int r1 = (((common_board[0][0] == 2) && (common_board[0][1] == 2)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0; // type casting from boolean to integer
        int r2 = (((common_board[0][1] == 2) && (common_board[0][2] == 2)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int r3 = (((common_board[0][0] == 2) && (common_board[0][2] == 2)) && ((common_board[0][1] != 1) && common_board[0][1] != 2)) ? 1 : 0;

        int r4 = (((common_board[1][0] == 2) && (common_board[1][1] == 2)) && ((common_board[1][2] != 1) && common_board[1][2] != 2)) ? 1 : 0;
        int r5 = (((common_board[1][1] == 2) && (common_board[1][2] == 2)) && ((common_board[1][0] != 1) && common_board[1][0] != 2)) ? 1 : 0;
        int r6 = (((common_board[1][0] == 2) && (common_board[1][2] == 2)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int r7 = (((common_board[2][0] == 2) && (common_board[2][1] == 2)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int r8 = (((common_board[2][1] == 2) && (common_board[2][2] == 2)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int r9 = (((common_board[2][0] == 2) && (common_board[2][2] == 2)) && ((common_board[2][1] != 1) && common_board[2][1] != 2)) ? 1 : 0;

        chrow[0] = r1;
        chrow[1] = r2;
        chrow[2] = r3;
        chrow[3] = r4;
        chrow[4] = r5;
        chrow[5] = r6;
        chrow[6] = r7;
        chrow[7] = r8;
        chrow[8] = r9;

        return chrow;
    }

    public int[] check_column() {

        int[] chcol = new int[9];

        int c1 = (((common_board[0][0] == 2) && (common_board[1][0] == 2)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int c2 = (((common_board[1][2] == 2) && (common_board[2][0] == 2)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int c3 = (((common_board[0][0] == 2) && (common_board[2][0] == 2)) && ((common_board[1][0] != 1) && common_board[1][0] != 2)) ? 1 : 0;

        int c4 = (((common_board[0][1] == 2) && (common_board[1][1] == 2)) && ((common_board[2][1] != 1) && common_board[2][1] != 2)) ? 1 : 0;
        int c5 = (((common_board[1][1] == 2) && (common_board[2][1] == 2)) && ((common_board[0][1] != 1) && common_board[0][1] != 2)) ? 1 : 0;
        int c6 = (((common_board[0][1] == 2) && (common_board[2][1] == 2)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int c7 = (((common_board[0][2] == 2) && (common_board[1][2] == 2)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int c8 = (((common_board[1][2] == 2) && (common_board[2][2] == 2)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0;
        int c9 = (((common_board[0][2] == 2) && (common_board[2][2] == 2)) && ((common_board[1][2] != 1) && common_board[1][2] != 2)) ? 1 : 0;

        chcol[0] = c1;
        chcol[1] = c2;
        chcol[2] = c3;
        chcol[3] = c4;
        chcol[4] = c5;
        chcol[5] = c6;
        chcol[6] = c7;
        chcol[7] = c8;
        chcol[8] = c9;



        return chcol;
    }

    public int[] check_horizontal() {

        int[] chhor = new int[6];

        int h1 = (((common_board[0][0] == 2) && (common_board[1][1] == 2)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int h2 = (((common_board[2][2] == 2) && (common_board[1][1] == 2)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int h3 = (((common_board[0][0] == 2) && (common_board[2][2] == 2)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int h4 = (((common_board[0][2] == 2) && (common_board[1][1] == 2)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int h5 = (((common_board[1][1] == 2) && (common_board[2][0] == 2)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0;
        int h6 = (((common_board[0][2] == 2) && (common_board[2][0] == 2)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        chhor[0] = h1;
        chhor[1] = h2;
        chhor[2] = h3;
        chhor[3] = h4;
        chhor[4] = h5;
        chhor[5] = h6;

        return chhor;
    }

    public int[] row_pc(){

        int[] pcrow = new int[9];

        // type casting to bool to int and checking condition
        int pr1 = (((common_board[0][0] == 1) && (common_board[0][1] == 1)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0;
        int pr2 = (((common_board[0][1] == 1) && (common_board[0][2] == 1)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int pr3 = (((common_board[0][0] == 1) && (common_board[0][2] == 1)) && ((common_board[0][1] != 1) && common_board[0][1] != 2)) ? 1 : 0;

        int pr4 = (((common_board[1][0] == 1) && (common_board[1][1] == 1)) && ((common_board[1][2] != 1) && common_board[1][2] != 2)) ? 1 : 0;
        int pr5 = (((common_board[1][1] == 1) && (common_board[1][2] == 1)) && ((common_board[1][0] != 1) && common_board[1][0] != 2)) ? 1 : 0;
        int pr6 = (((common_board[1][0] == 1) && (common_board[1][2] == 1)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int pr7 = (((common_board[2][0] == 1) && (common_board[2][1] == 1)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int pr8 = (((common_board[2][1] == 1) && (common_board[2][2] == 1)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int pr9 = (((common_board[2][0] == 1) && (common_board[2][2] == 1)) && ((common_board[2][1] != 1) && common_board[2][1] != 2)) ? 1 : 0;

        pcrow[0] = pr1;
        pcrow[1] = pr2;
        pcrow[2] = pr3;
        pcrow[3] = pr4;
        pcrow[4] = pr5;
        pcrow[5] = pr6;
        pcrow[6] = pr7;
        pcrow[7] = pr8;
        pcrow[8] = pr9;

        return pcrow;
    }

    public int[] column_pc() {

        int[] pccol = new int[9];

        int pc1 = (((common_board[0][0] == 1) && (common_board[1][0] == 1)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int pc2 = (((common_board[1][2] == 1) && (common_board[2][0] == 1)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int pc3 = (((common_board[0][0] == 1) && (common_board[2][0] == 1)) && ((common_board[1][0] != 1) && common_board[1][0] != 2)) ? 1 : 0;

        int pc4 = (((common_board[0][1] == 1) && (common_board[1][1] == 1)) && ((common_board[2][1] != 1) && common_board[2][1] != 2)) ? 1 : 0;
        int pc5 = (((common_board[1][1] == 1) && (common_board[2][1] == 1)) && ((common_board[0][1] != 1) && common_board[0][1] != 2)) ? 1 : 0;
        int pc6 = (((common_board[0][1] == 1) && (common_board[2][1] == 1)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int pc7 = (((common_board[0][2] == 1) && (common_board[1][2] == 1)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int pc8 = (((common_board[1][2] == 1) && (common_board[2][2] == 1)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0;
        int pc9 = (((common_board[0][2] == 1) && (common_board[2][2] == 1)) && ((common_board[1][2] != 1) && common_board[1][2] != 2)) ? 1 : 0;

        pccol[0] = pc1;
        pccol[1] = pc2;
        pccol[2] = pc3;
        pccol[3] = pc4;
        pccol[4] = pc5;
        pccol[5] = pc6;
        pccol[6] = pc7;
        pccol[7] = pc8;
        pccol[8] = pc9;

        return pccol;
    }

    public int[] horizontal_pc() {

        int[] pchor = new int[6];

        int ph1 = (((common_board[0][0] == 1) && (common_board[1][1] == 1)) && ((common_board[2][2] != 1) && common_board[2][2] != 2)) ? 1 : 0;
        int ph2 = (((common_board[2][2] == 1) && (common_board[1][1] == 1)) && ((common_board[0][0] != 1) && common_board[0][0] != 2)) ? 1 : 0;
        int ph3 = (((common_board[0][0] == 1) && (common_board[2][2] == 1)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        int ph4 = (((common_board[0][2] == 1) && (common_board[1][1] == 1)) && ((common_board[2][0] != 1) && common_board[2][0] != 2)) ? 1 : 0;
        int ph5 = (((common_board[1][1] == 1) && (common_board[2][0] == 1)) && ((common_board[0][2] != 1) && common_board[0][2] != 2)) ? 1 : 0;
        int ph6 = (((common_board[0][2] == 1) && (common_board[2][0] == 1)) && ((common_board[1][1] != 1) && common_board[1][1] != 2)) ? 1 : 0;

        pchor[0] = ph1;
        pchor[1] = ph2;
        pchor[2] = ph3;
        pchor[3] = ph4;
        pchor[4] = ph5;
        pchor[5] = ph6;

        return pchor;
    }

    public void move_pc() {
        int[] row = check_row();
        int[] column = check_column();
        int[] horizontal = check_horizontal();

        int[] prow = row_pc();
        int[] pcolumn = column_pc();
        int[] phorizontal = horizontal_pc();

        int q = 0, w = 0, e = 0;

        int q1 = 0, w1 = 0, e1 = 0;

        boolean qh = false, wh = false, eh = false;

        boolean qp = false, wp = false, ep = false;

        for (int r : row) {
            q = q + 1;
            if (r == 1) {
                qh = true;
                break;
            }
        }

        for (int c : column) {
            w = w + 1;
            if (c == 1) {
                wh = true;
                break;
            }
        }

        for (int h : horizontal) {
            e = e + 1;
            if (h == 1) {
                eh = true;
                break;
            }
        }

        for (int rp : prow) {
            q1 = q1 + 1;
            if (rp == 1) {
                qp = true;
                break;
            }
        }

        for (int cp : pcolumn) {
            w1 = w1 + 1;
            if (cp == 1) {
                wp = true;
                break;
            }
        }

        for (int hp : phorizontal) {
            e1 = e1 + 1;
            if (hp == 1) {
                ep = true;
                break;
            }
        }

        if (qp) {
            switch (q1) {
                case 1:
                    common_board[0][2] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3:
                    common_board[0][1] = pc_input;
                    break;
                case 4:
                    common_board[1][2] = pc_input;
                    break;
                case 5:
                    common_board[1][0] = pc_input;
                    break;
                case 6:
                    common_board[1][1] = pc_input;
                    break;
                case 7:
                    common_board[2][2] = pc_input;
                    break;
                case 8:
                    common_board[2][0] = pc_input;
                    break;
                case 9:
                    common_board[2][1] = pc_input;
                    break;
            }
        }
        else if (wp) {
            switch (w1) {
                case 1:
                    common_board[2][0] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3:
                    common_board[1][0] = pc_input;
                    break;
                case 4:
                    common_board[2][1] = pc_input;
                    break;
                case 5:
                    common_board[0][1] = pc_input;
                    break;
                case 6:
                    common_board[1][1] = pc_input;
                    break;
                case 7:
                    common_board[2][2] = pc_input;
                    break;
                case 8:
                    common_board[0][2] = pc_input;
                    break;
                case 9:
                    common_board[1][2] = pc_input;
                    break;
            }
        }
        else if (ep) {
            switch (e1) {
                case 1:
                    common_board[2][2] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3, 6:
                    common_board[1][1] = pc_input;
                    break;
                case 4:
                    common_board[2][0] = pc_input;
                    break;
                case 5:
                    common_board[0][2] = pc_input;
                    break;
            }
        }

        else if (qh) {
            switch (q) {
                case 1:
                    common_board[0][2] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3:
                    common_board[0][1] = pc_input;
                    break;
                case 4:
                    common_board[1][2] = pc_input;
                    break;
                case 5:
                    common_board[1][0] = pc_input;
                    break;
                case 6:
                    common_board[1][1] = pc_input;
                    break;
                case 7:
                    common_board[2][2] = pc_input;
                    break;
                case 8:
                    common_board[2][0] = pc_input;
                    break;
                case 9:
                    common_board[2][1] = pc_input;
                    break;
            }
        }
        else if (wh) {
            switch (w) {
                case 1:
                    common_board[2][0] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3:
                    common_board[1][0] = pc_input;
                    break;
                case 4:
                    common_board[2][1] = pc_input;
                    break;
                case 5:
                    common_board[0][1] = pc_input;
                    break;
                case 6:
                    common_board[1][1] = pc_input;
                    break;
                case 7:
                    common_board[2][2] = pc_input;
                    break;
                case 8:
                    common_board[0][2] = pc_input;
                    break;
                case 9:
                    common_board[1][2] = pc_input;
                    break;
            }
        }
        else if (eh) {
            switch (e) {
                case 1:
                    common_board[2][2] = pc_input;
                    break;
                case 2:
                    common_board[0][0] = pc_input;
                    break;
                case 3, 6:
                    common_board[1][1] = pc_input;
                    break;
                case 4:
                    common_board[2][0] = pc_input;
                    break;
                case 5:
                    common_board[0][2] = pc_input;
                    break;
            }

        }

        else {
            int z = 0;
            for (int i = 0; i<3; i++){
                for (int j = 0; j<3; j++){
                    if (common_board[i][j] == 0){
                        common_board[i][j] = pc_input;
                        z = z+1;
                    }
                    break;
                }
                if (z == 1) {
                    break;
                }
            }
        }

    }

    public void show() {
        String[][] string_board = new String[3][3];

        for (int i = 0;i < 3;i++){
            for (int j = 0;j<3;j++){
                if (common_board[i][j] == 0) {
                    string_board[i][j] = " ";
                }
                else if (common_board[i][j] == 1) {
                    string_board[i][j] = "O";
                }
                else if (common_board[i][j] == 2) {
                    string_board[i][j] = "X";
                }
            }
        }

        String e1,e2,e3,e4,e5,e6,e7,e8,e9;
        e1 = string_board[0][0];e2 = string_board[0][1];e3 = string_board[0][2];e4 = string_board[1][0];e5 = string_board[1][1];e6 = string_board[1][2];e7 = string_board[2][0];e8 = string_board[2][1];e9 = string_board[2][2];
        String zero = """
                %s|%s|%s
                _____
                %s|%s|%s
                _____
                %s|%s|%s
                """;
        System.out.printf(zero,e1,e2,e3,e4,e5,e6,e7,e8,e9);
    }

    public boolean checking(){
        int k = 0;
        for (int i = 0;i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                if (common_board[i][j] != 0) {
                    k = k + 1;
                }
            }
        }

        if (k == 9){
            show();
            System.out.println("Draw");
            return false;
        }

        if (((common_board[0][0] == common_board[0][1]) && (common_board[0][1] == common_board[0][2]) && common_board[0][2] != 0) || ((common_board[1][0] == common_board[1][1]) && (common_board[1][1] == common_board[1][2]) && common_board[1][2] != 0) || ((common_board[2][0] == common_board[2][1]) && (common_board[2][1] == common_board[2][2])) && common_board[2][2] != 0) {
            show();
            System.out.println("Game over");
            return false;
        }

        else if (((common_board[0][0] == common_board[1][0]) && (common_board[1][0] == common_board[2][0]) && common_board[2][0] != 0) || ((common_board[0][1] == common_board[1][1]) && (common_board[1][1] == common_board[2][1]) && common_board[2][1] != 0) || ((common_board[0][2] == common_board[1][2]) && (common_board[1][2] == common_board[2][2])) && common_board[2][2] != 0) {
            show();
            System.out.println("Game over");
            return false;
        }

        else if (((common_board[0][0] == common_board[1][1]) && (common_board[1][1] == common_board[2][2]) && common_board[2][2] != 0) || ((common_board[0][2] == common_board[1][1]) && (common_board[1][1] == common_board[2][0]) && common_board[2][0] != 0)) {
            show();
            System.out.println("Game over");
            return false;
        }

        return true;
    }



}

