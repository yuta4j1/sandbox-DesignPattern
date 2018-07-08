package composite;

public class Leaf extends Component {

	private String id;

	public Leaf(String id) {
		this.id = id;
	}

	@Override
	public void expression() {
		System.out.println("Leaf" + id);
	}

}
