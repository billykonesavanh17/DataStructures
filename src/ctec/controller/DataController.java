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
	}
	
	private void useTheCustomerQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(false, "", 3234.3));
		customerQueue.remove();
	}
	
	public void start()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}

}
