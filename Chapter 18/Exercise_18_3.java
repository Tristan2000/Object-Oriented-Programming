import java.util.Scanner;
class Exercise_18_3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the larger number: ");
		int m = input.nextInt();
		
		System.out.print("Enter the smaller number: ");
		int n = input.nextInt();

		System.out.print(gcd(n, m));
	}
	public static int gcd(int n, int m){
		int o = m % n;
		if (m % n == 0){
			return n;
		}
		else{
			return gcd(m % n ,n);
		}
	}
}