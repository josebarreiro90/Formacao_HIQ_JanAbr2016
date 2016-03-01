import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// int numbers[];
//		int[] numbers = new int[4];
//		display(numbers);
//		numbers[1]=5;
//		display(numbers);
//		numbers[numbers.length-1]=6;
//		display(numbers);
//
//		//ERRO - APENAS na declaração da variavel
//		//numbers= { 2 , 3 , 4 , 5};
//
//		int[] numbers1 = {1,2,3,4};
//		display(numbers1);
//
//
//		Object[] objects = new Object[4];
//
//		Person[] persons = new Person[4 ];
//
//
//		String[] strings = new String[4];
//
//		display(strings);


//		String[][] strings2d = new String[2][];
//		strings2d[0] = new String[2];
//		strings2d[1] = new String[4];
//
//		strings2d[0][0] = "Ola";
//		strings2d[1][2] = "Mundo";
//
//		display(strings2d);

		
		//TODO atenção ao index e array out of bound
		String[][][] strings3d = new String[3][3][3];
		strings3d[0][0][0] = "A";
		strings3d[2][2][2] = "Z";
		strings3d[0][1][0] = "E";
		strings3d[0][0][1] = "I";
		

		display(strings3d[1]);
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(0, "2");
		System.out.println(arrayList.set(0, "2"));
		
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(1);
		ints.add(2);
		System.out.println(ints);

		System.out.println(ints.remove(new Integer(2)));
		
		System.out.println(ints);
		
		
		

	}

	private static void display(int[] numbers){
		for (int number : numbers) {
			System.out.print(number);
		}
		System.out.println("");
	}
	private static void display(String[] strings){
		for (String str : strings) {
			System.out.print(str);
		}
		System.out.println("");
	}

	private static void display(String[][] strings){
		for (String[] array : strings) {
			display(array);		
		}
	}
	private static void display(String[][][] strings){
		for (String[][] array2d : strings) {
			display(array2d);		
		}
	}

}


class Person {}