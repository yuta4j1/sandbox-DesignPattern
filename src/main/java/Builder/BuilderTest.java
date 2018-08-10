package Builder;

public class BuilderTest {

	public static void main(String[] args) {

		new People.Builder().setName("Ted").setAge(24).setHobby("game").build().hello();
		new People.Builder().setName(null).setAge(19).setHobby("game").build().hello();

	}

}
