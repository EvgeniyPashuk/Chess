package com.vertex.desk;

import com.vertex.logic.Figure;

public class Table {

    private int turn;
    private String turnOwner;
    private Cell[][] coords = new Cell[8][8];

    public Table() {
        turn = 1;
        turnOwner = "White";
        init();
    }

    public void init() {
        String[] letters = {"a" , "b" , "c" , "d" , "e", "f", "g", "h"};
        //init main figures

        //init pawns

        //init Space Cells
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                coords[i][j] = new Cell(String.valueOf(i) , letters[j] , null);
            }
        }
    }

    public void turn() {

    }

    public void paintField() {

    }

    public void gameStart() {

    }


}
