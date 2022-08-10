package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{
    private Point a;
    private Point b;
    private Point c;
    private Point e;
    private double AB, BC, CE, EA, AC;

    public Quadrilateral(Point a, Point b, Point c, Point e) {
//        if(){
//            throw new UnsupportedOperationException();
//        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        AB = line(a,b);
        BC = line(b,c);
        CE = line(c,e);
        EA = line(e,a);
        AC = line(a,c);
    }

    private double line(Point a, Point b){
        return Math.sqrt((a.getX()- b.getX())*(a.getX()- b.getX())+(a.getY()- b.getY())*(a.getY()- b.getY()));
    }

    @Override
    public double area() {
        double s1 = (AB+BC+AC)/2;
        double s2 = (AC+CE+EA)/2;
        return (Math.sqrt(s1*(s1-AB)*(s1-BC)*(s1-AC))+Math.sqrt(s2*(s2-AC)*(s2-CE)*(s2-EA)));
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" +
                "(" + b.getX() + "," + b.getY() + ")" +
                "(" + c.getX() + "," + c.getY() + ")" +
                "(" + e.getX() + "," + e.getY() + ")" ;
    }

    @Override
    public String toString() {
        return "Quadrilateral[" +
                "(" + a.getX() + "," + a.getY() + ")" +
                "(" + b.getX() + "," + b.getY() + ")" +
                "(" + c.getX() + "," + c.getY() + ")" +
                "(" + e.getX() + "," + e.getY() + ")" +
                ']';
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX() && a.getX() <= e.getX()) return a;
        if (b.getX() <= a.getX() && b.getX() <= c.getX()&& b.getX() <= e.getX()) return b;
        if (c.getX() <= a.getX() && c.getX() <= b.getX()&& c.getX() <= e.getX()) return c;
        return e;
    }
}
