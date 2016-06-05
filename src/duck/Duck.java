package duck;

import behaviorService.FlyBehavior;
import behaviorService.QuackBehavior;

public abstract class Duck {
	   QuackBehavior quackBehavior;
	   FlyBehavior flyBehavior;
	   public void swim(){
			System.out.println("我会游泳");  
	   }
	   public void display(){
			System.out.println("展示");  
	   }
	   public void performQuack() throws Exception {
	      quackBehavior.quack();
	   }
	   public void performFly() throws Exception {
		   flyBehavior.fly();
	   }
	
	   public void setQuackBehavior(QuackBehavior quackbehavior) {
	      this.quackBehavior = quackbehavior;
	   }
	   public void setFlyBehavior(FlyBehavior flybehavior) {
		      this.flyBehavior = flybehavior;
	   }
}
