package com.java.coffeeMachine;

import java.util.Scanner;

public class Coffee {

	
	private String [] types = {"black","instant","cappuccino"};
	private String userSelectedType;
	private Boolean coffeeStrength;
	private int sugar;
	private Boolean milk;
	private String [] milkType = {"regular","Soy","Almond"};
	private String userMilkSelection;
	


	public Coffee() {

	}

	public Coffee(String userSelectedType, Boolean coffeeStrength, int sugar, Boolean milk) {
		setUserSelectedType(userSelectedType);
		setCoffeeStrength(coffeeStrength);
		setSugar(sugar);
		setMilk(milk);
		execute ();
	}

	public void makeCoffee () {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			displayCoffeeTypes ();
			System.out.println();
			System.out.println("4. Cancel.");
			System.out.println();
			System.out.println("Select the number of the type you want: ");
			
			String str = s.next();
			if (!isAnumber(str)) {		
				continue;
			}
			
			int key = Integer.valueOf(str);
			
			switch (key) {
			case 1:
				setUserSelectedType(types[0]);
				flag = false;
				break;
			case 2:
				setUserSelectedType(types[1]);
				flag = false;
				break;
			case 3:
				setUserSelectedType(types[2]);
				flag = false;
				break;
			case 4:
				flag = false;
				return;
	
			default:
				System.out.println("Must enter number between 1-4.");
				break;
			}
		}	
		
		flag = true;
		while (flag) {
			System.out.println("Enter sugar amount: ");
			
			String str = s.next();
			if (isAnumber(str)) {
				int sugar = Integer.valueOf(str);
				if (sugar < 0) {
					System.err.println("Must enter a positive value.");
					continue;
				} else {
					setSugar(sugar);
					flag = false;
				}
			}
		}	
		
		flag = true;
		while (flag) {
			displayMilkTypes ();
			System.out.println("4. No milk.");
			System.out.println();
			System.out.println("5. Cancel.");
			System.out.println();
			System.out.println("Select the number of the milk type you want: ");
			
			String str = s.next();
			if (!isAnumber(str)) {		
				continue;
			}
			
			int key = Integer.valueOf(str);
			
			switch (key) {
			case 1:
				setMilk(true);
				setUserMilkSelection(milkType[0]);
				flag = false;
				break;
			case 2:
				setMilk(true);
				setUserMilkSelection(milkType[1]);
				flag = false;
				break;
			case 3:
				setMilk(true);
				setUserMilkSelection(milkType[2]);
				flag = false;
				break;
			case 4:
				setMilk(false);
				flag = false;
				break;
			case 5:
				flag = false;
				return;
	
			default:
				System.out.println("Must enter number between 1-5.");
				break;
			}
		}
		
		flag = true;
		while (flag) {
			System.out.println("Enter Strength: ");
			System.out.println("1. Strong.");
			System.out.println("2. Weak.");
			System.out.println();
			System.out.println("3. Cancel.");
			
			String str = s.next();
			if (!isAnumber(str)) {		
				continue;
			}
			
			int key = Integer.valueOf(str);
			
			switch (key) {
			case 1:
				setCoffeeStrength(true);
				flag = false;
				break;
			case 2:
				setCoffeeStrength(false);
				flag = false;
				break;
			case 3:
				flag = false;
				return;
	
			default:
				System.out.println("Must enter number between 1-3.");
				break;
			}
		}	
		execute();
	}
	
	private void execute () {
		
		System.out.println();
		System.out.println("coffee: " + userSelectedType + ".");
		System.out.println("sugar: " + sugar + ".");
		if (milk) {
			System.out.println("Milk: " + userMilkSelection + " milk.");
		}
		if (coffeeStrength) {
			System.out.println("Strength: Strong.");
		} else {
			System.out.println("Strength: Weak.");
		}
	}

	public void displayMilkTypes () {
		System.out.println();
		System.out.println("Milk types available:");
		for (int i = 1; i < milkType.length+1; i++) {
			System.out.println(i + ". " + milkType[i-1]);
		}
	}
	
	public void displayCoffeeTypes () {
		System.out.println();
		System.out.println("Coffee types available:");
		for (int i = 1; i < types.length+1; i++) {
			System.out.println(i + ". " + types[i-1]);
		}
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
	
	
	
	
	


	public String[] getTypes() {
		return types;
	}

	private void setTypes(String[] types) {
		this.types = types;
	}

	public String getUserSelectedType() {
		return userSelectedType;
	}

	private void setUserSelectedType(String userSelectedType) {
		this.userSelectedType = userSelectedType;
	}

	public Boolean getCoffeeStrength() {
		return coffeeStrength;
	}

	private void setCoffeeStrength(Boolean coffeeStrength) {
		this.coffeeStrength = coffeeStrength;
	}

	public int getSugar() {
		return sugar;
	}
	
	private void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	public Boolean getMilk() {
		return milk;
	}
	
	private void setMilk(Boolean milk) {
		this.milk = milk;
	}
	
	public String[] getMilkType() {
		return milkType;
	}
	
	private void setMilkType(String[] milkType) {
		this.milkType = milkType;
	}

	public String getUserMilkSelection() {
		return userMilkSelection;
	}

	private void setUserMilkSelection(String userMilkSelection) {
		this.userMilkSelection = userMilkSelection;
	}
	

	
}


