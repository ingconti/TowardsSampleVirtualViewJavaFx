package org.openjfx;

import java.util.Observable;
import java.util.Observer;

public class GameModel  extends Observable {

    private CartesianCircle circle;

    public GameModel() {
        this.circle = new CartesianCircle(20, 20, 50);
    }
    /*
    public GameModel(Observer obs) {
        this.circle = new CartesianCircle(20, 20, 50);
        this.addObserver(obs);
    }*/

    void clicked(CartesianPoint here){
        notifyObservers(here);
    }
}
