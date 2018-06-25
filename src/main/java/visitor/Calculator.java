package visitor;

public class Calculator implements Visitor {

	@Override
	public int visit(NumNode node) {
		return node.value;
	}

	@Override
	public int visit(AddNode node) {
		int left = node.left.accept(this);
		int right = node.right.accept(this);
		return left + right;
	}

}
