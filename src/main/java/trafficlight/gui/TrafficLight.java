package trafficlight.gui;

import java.awt.*;

import pattern.Observer;
import trafficlight.states.State;

public class TrafficLight extends Light implements Observer{

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update(State o) {
        turnOn(!isOn);
    }
}
