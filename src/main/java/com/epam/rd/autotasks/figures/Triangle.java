package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    private Point A;
    private Point B;
    private Point C;

    public Triangle (Point A, Point B, Point C){
        if (A.getX() == B.getX() && A.getX() == C.getX()){
            throw new UnsupportedOperationException();
        }
        if (A.getY() == B.getY() && A.getY() == C.getY()){
            throw new UnsupportedOperationException();
        }
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double area() {
        double first = (A.getX() * B.getY()) - (A.getX() * C.getY());
        double second = (B.getX() * C.getY()) - (B.getX() * A.getY());
        double third = (C.getX() * A.getY()) - (C.getX() * B.getY());
        double result = (first + second + third) / 2;
        if(result < 0){
            result *= -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "(" + A.getX() + "," + A.getY() + ")" +
                "(" + B.getX() + "," + B.getY() + ")" +
                "(" + C.getX() + "," + C.getY() + ")" +
                ']';
    }

    @Override
    public String pointsToString() {
        return "(" + A.getX() + "," + A.getY() + ")" +
                "(" + B.getX() + "," + B.getY() + ")" +
                "(" + C.getX() + "," + C.getY() + ")" ;
    }

    @Override
    public Point leftmostPoint() {
        if (A.getX() <= B.getX() && A.getX() <= C.getX()){
            return A;
        }else if (B.getX() <= A.getX() && B.getX() <= C.getX()){
            return B;
        } else {
            return C;
        }
    }
}
