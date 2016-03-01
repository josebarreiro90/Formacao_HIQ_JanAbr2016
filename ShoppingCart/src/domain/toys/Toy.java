package domain.toys;

import domain.Product;

public abstract class Toy extends Product {

	private int minimunAge;

	public Toy(int id, String name, float price) {
		super(id, name, price);
	}
	
	public Toy(int id, String name, float price, int minimunAge) {
		super(id, name, price);
		setMinimunAge(minimunAge);
	}

	public int getMinimunAge() {
		return minimunAge;
	}
	
	public void setMinimunAge(int minimunAge) {
		this.minimunAge = minimunAge;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Toy [minimunAge=").append(getMinimunAge()).append("]");
		return builder.toString();
	}

	

}
