package com.java.coffeeMachine;

import java.util.Scanner;

public class Drinks {
	
	private final static String welcomeMsg = "Welcome! Make you own coffee with the push of a few buttons!";  
	
	private Coffee [] coffee = new Coffee [12];
	private int index = 0;
	
	public void  run(){
		showWelcomeMsg();
		printMenu();
		
	}
	
	private void showWelcomeMsg () {
		System.out.println("**********************************************************************");
		System.out.println("*                                                                    *");
		System.out.println("*                                                                    *");
		System.out.println("*    " + welcomeMsg + "    *");
		System.out.println("*                                                                    *");
		System.out.println("*                                                                    *");
		System.out.println("*                                                                    *");
		System.out.println("**********************************************************************");
	}
	
	private void printMenu(){
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag){
		
			System.out.println();
			System.out.println("Please Enter an option.");
			System.out.println("1. Make 12 cups of black coffee (1 sugar, no milk).");
			System.out.println("2. Make coffee.");
			System.out.println("3. Display milk types.");
			System.out.println("4. Display coffee types.");
			System.out.println("5. exit.");
			
			
			String str = scanner.next();
			if (!isAnumber(str)) {		
				continue;
			}
			
			int key = Integer.valueOf(str);
			
			switch (key) {
			case 1:
				System.out.println("Making 12 cups of black coffee (1 sugar, no milk).");
				make12Cups ();
				break;
			case 2:
				System.out.println("Make coffee:");
				makeCoffee ();
				break;
			case 3:
				displayMilkTypes ();
				break;
			case 4:
				displayCoffeeTypes ();
				break;
			case 5:
				System.out.println("Exit.");	
				flag = false;
				break;
	
			default:
				System.out.println("Must choose a number between 1-5.");
				break;
			}
		}
	}
	
	
	private void make12Cups () {
		for (int i = 0; i < coffee.length; i++) {
			coffee[i] = new Coffee("black", true, 1, false);
		}
	}
	
	private void makeCoffee () {
		coffee[index] = new Coffee();
		coffee[index].makeCoffee();
	}
	
	private void displayMilkTypes () {
		Coffee temp = new Coffee();
		temp.displayMilkTypes();
	}
	
	private void displayCoffeeTypes () {
		Coffee temp = new Coffee();
		temp.displayCoffeeTypes();
	}


	public boolean isAnumber(String str) {
		try {
			Integer.valueOf(str); //if str not a number The command will fail and jump to catch
			return true;
		} catch (Exception e) {
			System.err.println("Must enter a number.");
			return false;
		}
	}
	
	
	
	
	
	
	
}
