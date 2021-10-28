import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		double[] random = new double[100];
		Scanner input = new Scanner(System.in);
		int number;
		for (int i = 0; i < random.length; i++){
			random[i] = Math.random() * 100;
		}
		System.out.print("Enter a number from 1 to 100: ");
		number = input.nextInt();
		number = number - 1;
		try{
			if (number > 99 || number < 0){
				throw new IndexOutOfBoundsException("Out of Bounds");
			}
			System.out.print(random[number]);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
