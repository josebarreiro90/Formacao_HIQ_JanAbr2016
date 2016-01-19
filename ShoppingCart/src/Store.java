
public class Store {

	public static void main(String[] args) {

		final int MAX_CART_SIZE = 5;

		
		Customer customer = new Customer();
		customer.name = "Ze";
		
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "product1"; 
		product1.price = 1.1f;

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "product2"; 
		product2.price = 2.2f;

		Product product3 = new Product();
		product3.id = 3;
		product3.name = "product3"; 
		product3.price = 3.3f;
		
		Product product4 = new Product();
		product4.id = 4;
		product4.name = "product4"; 
		product4.price = 4.4f;
		
		ShoppingCart cart = new ShoppingCart();
		cart.setProducts(MAX_CART_SIZE);
		cart.setcustomer(customer);

		cart.addProduct(product1);
				
		cart.printProducts();
		
		cart.removeProduct(product1.id /*1*/);
		cart.finish();

		cart.printProducts();
		
		
		

	}

}
