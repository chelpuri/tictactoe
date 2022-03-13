package com.example.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import com.example.Strategy;

@Getter
@Setter
@SuperBuilder(toBuilder = true)

public class Bot extends Player{
    private PlayingStrategy playingStrategy;
}
