package test;

import behaviorImpl.FlyWithRocket;
import duck.Duck;
import duckImpl.MallardDuck;
import duckImpl.RedheadDuck;
import duckImpl.RubberDuck;

public class DuckTest {
	
	public static void main(String[] args) {
		System.out.println("===========��ͷѼ==================");
		Duck  RedheadDuck=new RedheadDuck();
		RedheadDuck.display();
		RedheadDuck.swim();
		try {
			RedheadDuck.performFly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			RedheadDuck.performQuack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========����===================");
		System.out.println("===========��ͷѼ===================");
		Duck MallardDuck=new MallardDuck();
		MallardDuck.display();
		MallardDuck.swim();
		try {
			MallardDuck.performFly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			MallardDuck.performQuack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========����===================");
		System.out.println("===========����Ѽ===================");
		Duck RubberDuck=new RubberDuck();
		RubberDuck.display();
		RubberDuck.swim();
		try {
			RubberDuck.performFly();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����ѼͻȻ���û�����Է��ˣ�");
		RubberDuck.setFlyBehavior(new FlyWithRocket());
		try {
			RubberDuck.performFly();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			RubberDuck.performQuack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========����===================");
		
	}
}
