import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {

	public int myinteger = 10;

	public static void main(String... args) {

		int a; // declara��o

		a=1; // inicializa��o ou afecta��o

		short b = 2;  // 1 e 2 s�o sempre int's 

		double d = 3.3;

		float f = 4.4f;    // s� 4.4 e 3.3 � interpretado como double

		char c = 65; //='A'


		final int NUM_MAX = 200_000_000;

		/*
		 *  _ ou $ --> nomes de variaveis _abc ou $abc
		 */


		System.err.println(Integer.MAX_VALUE);

		int myInter = 10;



		System.out.println(""+4+4+4+4+4+"B"+3 +3+ 3 +"A");


		String s1="s1", s2="s2";

		//	for(/*inicializa��o*/;/*condi��o de paragem*/;/*Afecta��o*/)

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		//		for (String string : args) {
		//			System.out.println(string);
		//		}

		int i; // DECLARA��O
		i=0;   // INICIALIZA��O  e AFECTA��O

		while (i < args.length) {
			System.out.println(args[i++]);	
		}

		int j = 0;
		do { // executaa sempre a primeira vez sem ver a condi��o de paragem
			System.out.println(args[j++]);
		} while (j < args.length);


		{
			//Operators
			// 1) Parentheses
			// 2) Increment/decremente
			// 3) * / %
			// 4) + -

			int number=10;
			int count = ++number * 10 +((--number) - 2) ;
			int count1 = ++number * 10 + (--number - 2) ;
			int count2 = number * 10 + --number - 2 ;
			
			

			System.out.println(count);
			System.out.println(count1);
			System.out.println(count2);
			
			
			
			/*
			 * BYTE !!!! -128 127
			 */
			
			
			{
				
				
				
				
				System.out.println(1 /2.0 + "");
				
			}
			
			
			{
				
				
				short ss=120;
				char cc= 120;
				if (ss==cc) {
					System.out.println("YEs");
					
				}
			}

		}


	}

}
