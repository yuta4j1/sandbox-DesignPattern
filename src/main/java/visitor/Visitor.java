package visitor;

public interface Visitor {

	int visit(AddNode node);

	int visit(NumNode node);

}
