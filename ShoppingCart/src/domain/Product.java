package domain;
public class Product {
	private final int id;
	private String name;
	private float price;

	public Product(int id) {
		super();
		this.id = id;
	}


	public Product(int id, String name, float price) {
		this(id);
		setName(name);
		setPrice(price);
	}



	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [getId()=").append(getId()).append(", getName()=").append(getName())
		.append(", getPrice()=").append(getPrice()).append("]");
		return builder.toString();
	}









}
