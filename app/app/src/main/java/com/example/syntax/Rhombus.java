package com.example.syntax;

public class Rhombus extends Shape{

    int angle1;
    int angle2;

    int sideSize;

    public Rhombus(int x, int y, int angle1, int angle2, int sideSize) {
        super(x, y);
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.sideSize = sideSize;
    }
}
