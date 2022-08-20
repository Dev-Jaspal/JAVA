import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class TestDriverDog {

	public static void main(String... s)
	{
		final int SIZE = 4;
		String[] nickNameArray = {"Smily", "Loud", "Restless", "Sleepy"};
		Dog[] dogs = new Dog[SIZE];
		fillDogArray(nickNameArray, dogs);
		
		Stack<Dog> dogStack = new Stack<>();
		fillDogStack(dogs, dogStack);
		
		Queue<Dog> dogQueue = new LinkedList<>();
		fillDogQueue(dogStack, dogQueue);
		displayDogQueue(dogQueue);
	}
	
	public static void fillDogArray(String[] nickNameArray, Dog[] dogs)
	{
		Random random = new Random();
		for (int i = 0; i < dogs.length; i++) {
			int index = random.nextInt(4);
			Dog dog = new Dog();
			dog.setNickName(nickNameArray[index]);
			dogs[i] = dog;
		}
	}
	
	public static void fillDogStack(Dog[] dogs, Stack<Dog> dogStack)
	{
		for (int i = 0; i < dogs.length; i++) {
			dogStack.add(dogs[i]);
		}
	}
	
	
	public static void fillDogQueue(Stack<Dog> dogStack, Queue<Dog> dogQueue)
	{
		while(!dogStack.isEmpty()) {
			dogQueue.add(dogStack.pop());
		}
	}
	
	public static void displayDogQueue(Queue<Dog> dogQueue)
	{
		for (Dog dog : dogQueue) {
			System.out.println(dog);
		}
	}
}
