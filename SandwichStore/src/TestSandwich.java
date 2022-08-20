
public class TestSandwich {

	public static void main(String[] args) {

		Sandwich sandwich = new Sandwich();

		// set the ingredient in sandwich.
		sandwich.setIngredient("cheese");

		// set the bread type of sandwich.
		sandwich.setType("Multi-grain");

		// set the price of sandwich.
		sandwich.setPrice(5);

		System.out.println("You order a " + sandwich.getIngredient() + " sandwich with " + sandwich.getType()
				+ " bread." + "\nTotal cost is $" + sandwich.getPrice());
	}

}
