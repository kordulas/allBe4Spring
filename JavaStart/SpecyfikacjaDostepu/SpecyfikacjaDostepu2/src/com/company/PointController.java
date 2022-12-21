package com.company;

public class PointController {

    void addX(Point p){
        p.setX(p.getX()+1);
    }

    void addY(Point p){
        p.setY(p.getY()+1);
    }

    void minusX(Point p){
        p.setX(p.getX()-1);
    }

    void minusY(Point p){
        p.setY(p.getY()-1);
    }

}
