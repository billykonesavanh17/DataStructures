package ctec.controller;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

import ctec.model.*;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	private void doStuffToDishes()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true, java.awt.Color.BLUE, 8));
		System.out.println(dishes.size());
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 17));
		dishes.push(new Dish(true, java.awt.Color.GRAY, 17));
		
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "Bob", 3234.3));
		customerQueue.remove();
		customerQueue.peek();
		customerQueue.add(new Customer(true, "Peter", 6969));
		customerQueue.add(new Customer(true, "Jonny", 7000));
		customerQueue.peek();
		customerQueue.remove();
		
	}
	
	public void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}

}
