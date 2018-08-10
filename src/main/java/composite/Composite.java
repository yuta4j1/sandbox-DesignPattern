package composite;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Composite extends Component {

	private String id;
	/* 単一要素と複合要素を同様に扱えるリスト */
	private List<Component> childComponents = new ArrayList<>();
	private Queue<Composite> compositeQueue = new ArrayDeque<>();

	public  Composite(String id) {
		this.id = id;
	}

	public void add(Component childComponent) {
		childComponents.add(childComponent);
	}

	public void iterateExpression() {
		childComponents.forEach(c -> {
			c.expression();
			if(c instanceof Composite) compositeQueue.add((Composite) c);
		});
		if(compositeQueue.size() > 0) {
			compositeQueue.poll().iterateExpression();
		}

	}

	@Override
	public void expression() {
		System.out.println("Composite" + id);
	}

}
