package visitor;

import java.io.IOException;
import java.io.Writer;

public class Printer implements Visitor {

	private final Writer out;

	public Printer(Writer out) {
		this.out = out;
	}

	@Override
	public int visit(NumNode node) {
		try {
			out.write(String.valueOf(node.value));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return 0;
	}

	@Override
	public int visit(AddNode node) {
		try {
			out.write("[ ");
			node.left.accept(this);
			out.write(" + ");
			node.right.accept(this);
			out.write(" ]");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return 0;
	}

}
