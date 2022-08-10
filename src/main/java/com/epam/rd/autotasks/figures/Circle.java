package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    Point center;
    private double radius;


    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        double pi = Math.PI;
        return pi * Math.pow(radius,2);
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }

    @Override
    public String toString() {
        return "Circle[" +
                "(" + center.getX() + "," + center.getY() + ")" +
                radius + ']';
    }

    @Override
    public Point leftmostPoint() {
        Point leftmostPoint = new Point(center.getX()-radius, center.getY());
        return leftmostPoint;
    }
}
