package animal;

import org.junit.Test;

public class AnimalTest {
	@Test
	public static void main(String[] args) {
		Animal animal = new Student("zhangsan", 20);
		System.out.println(animal);
		animal.speak();
	}
	
}
