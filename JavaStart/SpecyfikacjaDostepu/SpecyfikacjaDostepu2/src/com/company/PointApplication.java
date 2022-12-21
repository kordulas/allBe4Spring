package com.company;

public class PointApplication {

    public static void main(String[] args) {

        Point p1 = new Point(4,5);
        PointController point1 = new PointController();
        point1.addX(p1);
        //System.out.println(p1);
        //point1.addY(p1);
        //System.out.println(p1);

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        int option = minusY;
        switch (option){
            case addX:
                point1.addX(p1);
                break;
            case addY:
                point1.addY(p1);
                break;
            case minusX:
                point1.minusX(p1);
                break;
            case minusY:
                point1.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println(p1);
    }
}
