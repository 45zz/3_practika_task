package com.company;

import com.company.moveable.MovableCircle;
import com.company.moveable.MovableRectangle;
import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Shape;
import com.company.shapes.Square;

public class Main {

    public static void main(String[] args) {
        Shape s1 = new Circle( "RED", false, 5.5);

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        System.out.println();

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println();

        Shape s3 = new Rectangle( "RED", false,1.0,2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println();

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println();

        Shape s4 = new Square(4.4);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());
        System.out.println();

        Square sq1 = new Square();
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());

        System.out.println("-----------------------");

        MovableCircle s=new MovableCircle(0,0,3,3,5);
        System.out.println(s);
        s.moveDown();
        System.out.println(s);

        System.out.println("-----------------------");

        MovableRectangle a=new MovableRectangle(0,0,10,10,3,3);
        System.out.println(a);
        a.moveDown();
        a.moveDown();
        System.out.println(a);
    }
}