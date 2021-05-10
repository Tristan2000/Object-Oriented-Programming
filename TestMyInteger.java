import java.util.Scanner;
public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger newInteger = new MyInteger(29);
		MyInteger a = new MyInteger(6);
		char[] c = {'1', '2', '3'};
		System.out.println(newInteger.isEven() + " " + newInteger.isEven(20) + " " + newInteger.isEven(a));
		System.out.println(newInteger.isOdd() + " " + newInteger.isOdd(2) + " " + newInteger.isOdd(a));
		System.out.println(newInteger.isPrime() + " " + newInteger.isPrime(5) + " " + newInteger.isPrime(a));
		System.out.println(newInteger.equals(29) + " " + newInteger.equals(a));
		System.out.println(newInteger.equals(30) + " " + newInteger.equals(a));
		System.out.println(newInteger.parseInt(c));
		System.out.println(newInteger.parseInt("5684953"));
	}
}
class MyInteger{
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	//non static
	public boolean isEven(){
		if(value % 2 == 0){
			return true;
		}
		return false;
	}
	public boolean isOdd(){
		return !isEven();
	}
	public boolean isPrime(){
		boolean flag = false;
		for (int i = 2; i <= value / 2; ++i) {
			// condition for nonprime number
			if (value % i == 0) {
				return false;			
			}
		}
		return true;

	}
	
	//Static
	public static boolean isEven(int value){
		if(value % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(int value){
		return !isEven(value);
	}
	public static boolean isPrime(int value){
		for (int i = 2; i <= value / 2; ++i) {
			// condition for nonprime number
			if (value % i == 0) {
			return false;
			}
		}
		return true;
	}
	
	
	//other statics
	public static boolean isEven(MyInteger myInt){
		if(myInt.getValue() % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger myInt){
		return !isEven(myInt.getValue());
	}
	public static boolean isPrime(MyInteger num){
		for (int i = 2; i <= num.getValue()/ 2; ++i) {
			// condition for nonprime number
			if (num.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	
	}
	
	//non static equals
	public boolean equals(int value){
		if(this.value == value){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger myInt){
		if(this.value == myInt.getValue()){
			return true;
		}
		return false;
	}
	
	//static parse
	public static int parseInt(char[] value){
		int a = 0;
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < value.length; i++){
			a = a * 10 + value[i] - '0';
			//a++;
		}
		return a;
		
	}
	public static int parseInt(String value){
		return Integer.parseInt(value);
	}
}