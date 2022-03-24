import java.util.*;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new HashMap<>();
		ArrayList<WordOccurrence> list = new ArrayList<>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}

		// Display key and value for each entry
//		map.forEach((k, v) -> System.out.println(k + "\t" + v));
		for(String key: map.keySet()){
			list.add(new WordOccurrence(key, map.get(key)));
		}
		
		Collections.sort(list);
		for(WordOccurrence item : list){
			System.out.println(item);
		}
	}
}
class WordOccurrence implements Comparable<WordOccurrence>{
	String word;
	int count;
	
	public WordOccurrence(String word, int count){
		this.word = word;
		this.count = count;
	}
	@Override
	public int compareTo(WordOccurrence w){
		if (this.count > w.count){
			return 1;
		}
		else if (this.count < w.count){
			return -1;
		}
		else{
			return 0;
		}
	}
	@Override public String toString(){
		return word + ": " + count;
	}
}