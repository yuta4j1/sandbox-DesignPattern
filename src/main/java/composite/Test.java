package composite;

public class Test {

	public static void main(String[] args) {

		Composite root = new Composite("1");
		root.add(new Leaf("11"));
		root.add(new Leaf("12"));
		Composite childA = new Composite("13");
		root.add(childA);
		root.add(new Leaf("14"));

		childA.add(new Leaf("131"));
		childA.add(new Leaf("132"));
		childA.add(new Leaf("133"));

		root.expression();
		root.iterateExpression();
	}

}
