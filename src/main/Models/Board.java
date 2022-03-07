package com.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Board {
 ArrayList<ArrayList<BoardCell>> cells=new ArrayList<>();
    public Board(int rows,int columns)
     {
         List<BoardCell> columnCells=new Collections.nCopies(columns, new BoardCell());
         ArrayList<ArrayList<BoardCell>> rowCells=new Collections.nCopies(rows, columnCells);
         this.cells=rowCells;
     }   
}
