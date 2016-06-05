package duckImpl;

import behaviorImpl.FlyNoWay;
import behaviorImpl.Squeak;
import duck.Duck;

public class RubberDuck extends Duck {
public RubberDuck(){
	setFlyBehavior(new FlyNoWay());
	setQuackBehavior(new Squeak());
}
@Override
public void display() {
	System.out.println("Œ“ «À‹¡œ—º");
}
}
