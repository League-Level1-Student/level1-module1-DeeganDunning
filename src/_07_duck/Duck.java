package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	void quack() {
System.out.println("The duck quacks when he gets his favorite food.");

	}
	void waddle() {
System.out.println("The duck waddles with his friends.");

	}



}
