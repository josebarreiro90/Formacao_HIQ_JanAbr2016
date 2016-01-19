public class ShoppingCart {

	/*
	 * Attributes
	 */
	private float total;
	private boolean finished;
	Customer customer;
	private Product[] products;
	private int cartSize;
	/*
	 * Actions
	 */
	public void addProduct(Product product) {

		//		for (int i = 0; i < products.length; i++) {
		//			if (products[i] == null) {
		//				products[i] = product;
		//				total+=product.price;  
		//				cartSize++;
		//				break;
		//			}
		//
		//			//			if (products[i] != null) 
		//			//				continue;
		//			//
		//			//			products[i] = product;
		//
		//		}

		if (!finished && cartSize<products.length) {
			products[cartSize++] = product;
			total += product.price;
		}


	}

	public void removeProduct(int id) {
		if (finished) return;
		for (int i = 0; i < products.length; i++) {
			if (products[i].id == id) {
				total -= products[i].price;
				products[i] = products[--cartSize];
				products[cartSize] = null;
				break;
			}
		}
	}

	public boolean isFinished() {	
		return finished;
	}

	public void finish(){
		finished=true;
	}

	public float getTotal() {
		return total;
	}

	public void printProducts() {
		for (int i = 0; i < products.length; i++) {
			if (products[i]!= null) {
				System.out.println(i +": "+products[i].name);
			}
		}System.out.println("---" +finished+ ". Total: "+total+ "----");
	}

	public void setProducts(int size) {
		products = new Product[size];
	}

	public void setcustomer(Customer customer) {
		this.customer=customer;		
	}

}
