package Builder;

public class People {

	private String name;
	private int age;
	private String hobby;

	static class Builder {
		private String name;
		private int age;
		private String hobby;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setHobby(String hobby) {
			this.hobby = hobby;
			return this;
		}

		public People build() {
			if (name == null || age == 0) {
				throw new IllegalArgumentException();
			}
			return new People(this);
		}
	}

	private People(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.hobby = builder.hobby;
	}

	void hello() {
		System.out.println(String.format("My name is %s. I'm %d years old.\n My hobby is %s.\n", this.name, this.age, this.hobby));
	}

}
