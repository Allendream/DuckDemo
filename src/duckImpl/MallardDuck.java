package duckImpl;


import behaviorImpl.FlyWithWings;
import behaviorImpl.Quack;
import duck.Duck;

public class MallardDuck extends Duck {
	
public  MallardDuck (){
	setFlyBehavior(new FlyWithWings());
	setQuackBehavior(new Quack());
}
@Override
public void display() {
	System.out.println("Œ“ «¬ÃÕ∑—º");
}
}
