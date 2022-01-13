import java.util.Scanner;
class Exercise_18_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String you want Reversed: ");
		String value = input.nextLine();
		reverseDisplay(value);
	}
	public static void reverseDisplay(String value){
		if (value.length() > 0){
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
			
		}
	}
}