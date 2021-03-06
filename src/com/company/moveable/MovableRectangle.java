package com.company.moveable;

import com.company.moveable.MovablePoint;
import com.company.moveable.Moveable;

public class MovableRectangle implements Moveable {
    private MovablePoint topLeft;
    private  MovablePoint bottomRight;


    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);


    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;

    }

    @Override
    public void moveRight() {
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;

    }
    public boolean difSpeeds(){
        return topLeft.xSpeed==bottomRight.xSpeed && topLeft.ySpeed==bottomRight.ySpeed;
    }
}
