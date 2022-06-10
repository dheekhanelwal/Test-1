package com.java;
import java.util.*;

class Pizza
{
	 String pizzabase;
	 int price;
	
	Pizza(String pizzabase, int price)
	{
		this.pizzabase = pizzabase;
		this.price = price;
	}
	void display()
	{
		System.out.println(pizzabase + " " + price);;
	}
}


class ChickenPizza extends Pizza
{
	String cvariable    = "Chicken Topping";
	ChickenPizza(String pizzabase, int price)
	{
		super(pizzabase,price);
	}
	void display()
	{
		System.out.println(pizzabase + " " + price + " " + cvariable );
	}
}

class MuttonPizza extends ChickenPizza
{
	
	String flavouredtopping   = "Mutton Topping";
	MuttonPizza (String pizzabase, int price)
	{
		super(pizzabase,price);
	}
	void display()
	{
		System.out.println(pizzabase + " " + price + " " + flavouredtopping );
	}
}


public class Pizzahut {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose option from given below");
		System.out.println("press 1 for Simple pizza");
		System.out.println("press 2 for Chicken pizza");
		System.out.println("press 3 for Mutton pizza");
		int option = scn.nextInt();
		
		if(option==1)
		{
			Pizza pz = new Pizza("fdd",230);
			pz.display();
		}
		else if(option==2)
		{

			Pizza pz1 = new ChickenPizza("fdd",240);
			pz1.display();
			
		}
		else if(option==3)
		{
			ChickenPizza pz2 = new MuttonPizza("fdd",250);
			pz2.display();
		}
		else
		{
			System.out.println("Wrong input");
		}
		scn.close();
	
	}

}
