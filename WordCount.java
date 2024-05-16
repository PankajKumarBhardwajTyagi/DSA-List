package last;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Map<String, Integer> frequencies = new HashMap<String, Integer>();
		System.out.println("Enter a Sentence Below:");
		Scanner input = new Scanner(System.in).useDelimiter("[^a-zA-z]+");
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			if(word.equals("")) break;
			Integer frequency = frequencies.get(word);
			if(frequency == null) frequency = 0;
			frequencies.put(word, ++frequency);
		}
		input.close();
		System.out.println(frequencies);
		String maxWord = "";
		Integer maxCount = 0;
		for(Entry<String, Integer> entry : frequencies.entrySet()) {
			String word = entry.getKey();
			System.out.printf("%12s: ", word);
			for(int count = 1; count <= entry.getValue(); ++ count) {
				System.out.printf("*");
			}
			System.out.println();
			if(entry.getValue() > maxCount) {
				maxWord = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("The most frequent word is " + maxWord + " Occurring " + maxCount + " time(s)");
	}
}