import java.util.Date;

import model.Employee;

public class App {

	public static void main(String[] args) {

		Employee e = new Employee(new Date(), "OLa", "A", 0);
		System.err.println(e.getName());
	}

}
