package visitor;

public class NumNode implements Node {

	public final int value;

	public NumNode(int value) {
		this.value = value;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
