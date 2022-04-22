import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String userString = input.next();
		LinkedList<Character> consecutive = new LinkedList<>();
		LinkedList<Character> longest = new LinkedList<>();
		for (int i = 0; i < userString.length(); i++){
			if(consecutive.size() > 1 && userString.charAt(i) <= consecutive.getLast()){
				consecutive.clear();
			}
			consecutive.add(userString.charAt(i));
			if(consecutive.size() > longest.size()){
				longest.clear();
				longest.addAll(consecutive);
			}
		}
		
		System.out.println(longest);
	}
}
/*
worst case O(n²)
*/