package com.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Player {
    private Symbol gameSymbol;
    public abstract BoardCell makeMove(Board board);
}
