
public class ArrayDemo {

	public static void main(String[] args) {
		final int SIZE = 10;
		int x=10;
		double[] sales; //no memory is allocated
		sales = new double[SIZE];
		//sales= {1,2,3,4,5,6,7,8,9,0}; //gives errors
		
		sales[0]=10;
		for(int i=0;i<sales.length;i++) {
			System.out.println(sales[i]);
		}
		//initialization list
		
		int[] numbers = {3,5,6,8,9,0};
		
		int[] numbers2 = numbers;
		
		numbers[2] = 56;
		
		//enhanced for loop
		for(int num:numbers) {
			System.out.print(num + "\s" );
		}
		System.out.println();
		for(int num:numbers2) {
			System.out.print(num + "\s" );
		}
		
		String[] strings = {"Java", "JavaScript", "C#", "Python"};

		double[][] sales2d = new double[4][];
		
		System.out.println("This is test 1");


	}

}
