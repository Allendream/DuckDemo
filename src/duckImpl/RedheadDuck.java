package duckImpl;

import behaviorImpl.FlyWithRocket;
import behaviorImpl.MuteQuack;
import duck.Duck;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
	setFlyBehavior(new FlyWithRocket());
	setQuackBehavior(new MuteQuack());
	}
	@Override
	public void display() {
		System.out.println("Œ“ «∫ÏÕ∑—º");
	}
}
