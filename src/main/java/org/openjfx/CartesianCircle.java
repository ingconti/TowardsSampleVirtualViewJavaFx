package org.openjfx;

public class CartesianCircle {

    private CartesianPoint center;
    private double radius;

     CartesianCircle(double x, double y, double radius){
        this.center = new CartesianPoint(x,y);
        this.radius = radius;
    }

}
