package com.example.Strategy;

import com.models.BoardCell;
import com.models.Board;

public interface PlayingStrategy {
    BoardCell Play(Board board);
}
