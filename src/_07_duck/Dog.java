package _07_duck;

public class Dog {
String breed ;
String favoriteToy;

Dog(String favoriteToy, String breed) {
	this.favoriteToy = favoriteToy;
	this.breed = breed;
}
void bark() {
	System.out.println("The dog barks when playing with his favorite toy.");
}

void run() {
	System.out.println("The dog runs with his friends.");	
}



}
