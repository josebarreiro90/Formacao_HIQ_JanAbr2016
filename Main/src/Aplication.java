
public class Aplication {

	public static void main(String[] args) {

		//	String name1 = "Ze";

		String name2 = new String("Ze");

		String name3 = "Ze";

	//	name3.replace("e", "e");
//		System.out.println(name2 == name3);
//
//		System.out.println(name2 == name3);
//
//
//		System.out.println(name2.equals(name3));
//		
		
		int x = 10;
		int i = 10;
		
		method(x);
		
		String s = "ZE";
		 method(s);
		
	}

	/**
	 * TIPO PRIMITIVO
	 * @param x <- cópia do valor 10 
	 */
	public static void method(int x){
		System.out.println(x);
	}
	
	
	
	/**
	 * TIPO REFEREANCIA
	 * @param s <- cópia da REFERENCIA do objecto String 
	 */
	public static void method(String s){
		System.out.println(s);
	}


}
