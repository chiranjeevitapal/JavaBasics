package runtimepolymorphism;

class Animal{
	String sound(){
		return "Generic Sound of Animal";
	}
}
class Dog extends Animal{
	String sound(){
		return "Dog Barks...";
	}
}
class Cat extends Animal{
	String sound(){
		return "Cat Meaows...";
	}
}

class DynamicBinding {
	public static void main(String args[]){
		Animal animal = new Dog();
		System.out.println(animal.sound());
	}
}
