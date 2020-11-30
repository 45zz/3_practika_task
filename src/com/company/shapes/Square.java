package com.company.shapes;

public class Square extends Rectangle {


    public double getSide() {
        return width;
    }

    public void setSide(int side) {
        this.width = side;
    }

    public Square() {}

    public Square(double width) {
        super(width, width);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }


}
