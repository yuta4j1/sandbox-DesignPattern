package visitor;

public class AddNode implements Node {

	public final Node left;
	public final Node right;

	public AddNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
