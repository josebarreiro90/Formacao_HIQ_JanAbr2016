import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	static int x;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {

//
//		int a=10, b=2;
//		int c = (b--)-(--a);
//		System.out.println(c);
//		System.out.println(b);
//
//
//
//		if (true) 
//			if (false) 
//				System.out.println("A");
//			else 
//				System.out.println("B");
//
//
//
//		System.out.println(new Object().hashCode());
//
//		//		byte b = 320;
//
//		int i = 1234567890;
//		float f = i;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(f);
//		System.err.println(i - (int)f);
//
//
//		Integer in = new Integer(42);
//		Long ln = new Long(42);
//		Double d = new Double(42.2);
//
//		// System.out.println(in == ln); Tipo nao compativel
//
//		int intt = 2;
//		long longg = 2;
//
//		System.out.println(intt == longg);
//
//		x = 2;
//		//this.x=2;    não há this. num metodos statico
//
//
//	//	System.out.println(args[0]); //java.lang.ArrayIndexOutOfBoundsException
//
//		short s = 10;
//			//	char cc = s;// -> not valid - memso tamanho mas são incompativeis
//			//	s=cc;		//-> not valid
		
		int m = 1;
		
		System.out.println(m++ + ++m + ++m);

		
		System.out.println(m++ + (++m + ++m));
		
	}

}
