package org.openjfx;

public class CartesianCircle {

    private CartesianPoint center;
    private int radius;

     CartesianCircle(int x, int y, int radius){
        this.center = new CartesianPoint(x,y);
        this.radius = radius;
    }

}
