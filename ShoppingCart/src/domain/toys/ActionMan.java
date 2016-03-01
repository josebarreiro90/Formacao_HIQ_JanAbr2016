package domain.toys;

public class ActionMan extends Toy {

	private final String type;

	public ActionMan(int id, String name, float price, int minimunAge,String type) {
		super(id, name, price, minimunAge);
		this.type=type;
	}

	public String getType() {
		return type;
	}

}
