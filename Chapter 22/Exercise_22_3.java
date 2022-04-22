import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = input.nextLine();
		System.out.println("Enter the second String: ");
		String s2 = input.nextLine();
		System.out.println("matched at index: ");
		
		System.out.println(subStringFinder(s1, s2));
	}
	public static Integer subStringFinder(String s1, String s2){
		int s1Length = s1.length();
		int s2Length = s2.length();
		for (int i = 0; i <= s1Length - s2Length; i++){
			int j;
			for(j = 0; j < s2Length; j++){
				if(s1.charAt(i + j) != s2.charAt(j)){
					break;
				}
			}
			if (j == s2Length){
				return i;
			}
		}
		return -1;
	}
}
/*O(String * Pattern)*/