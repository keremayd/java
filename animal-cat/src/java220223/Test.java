package java220223;

public class Test {

	public static void main(String[] args) {
		Cat catObject1 = new Cat(true, "milk", 4, "white");
		System.out.println("1.CAT");
		System.out.println("Cat is Vegetarian?");
		System.out.println(catObject1.getVegetarian()==true? "YES":"NO");
		System.out.println("Cat eats "+catObject1.getEats());
		System.out.println("Cat has "+catObject1.getNoOfLegs()+ " legs");
		System.out.println("Cat color is "+catObject1.getColor());
	
		Cat catObject2 = new Cat(true, "cheese", 4, "black");
		System.out.println("2.CAT");
		System.out.println("Cat is Vegetarian?");
		System.out.println(catObject2.getVegetarian()==true? "YES":"NO");
		System.out.println("Cat eats "+catObject2.getEats());
		System.out.println("Cat has "+catObject2.getNoOfLegs()+ " legs");
		System.out.println("Cat color is "+catObject2.getColor());
		
		Cat catObject3 = new Cat(false, "fish", 4, "white");
		System.out.println("3.CAT");
		System.out.println("Cat is Vegetarian?");
		System.out.println(catObject3.getVegetarian()==true? "YES":"NO");
		System.out.println("Cat eats "+catObject3.getEats());
		System.out.println("Cat has "+catObject3.getNoOfLegs()+ " legs");
		System.out.println("Cat color is "+catObject3.getColor());
	}

}
