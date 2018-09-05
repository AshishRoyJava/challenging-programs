package problems.array;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("I am playing cricket you should also join cricket team");
		String freqKey = "cricket";
		
		
		Stream<String> stream = Stream.of(str.toLowerCase().split("\\W+")).parallel();
		Map<String, Long> wordFreq = stream
		     .collect(Collectors.groupingBy(String::toString,Collectors.counting()));
		
		
		 for (Map.Entry<String,Long> entry : wordFreq.entrySet()) {
			 if(entry.getKey().equalsIgnoreCase(freqKey)) {
				 System.out.println("Key = " + entry.getKey() +
	                     ", Value = " + entry.getValue());
			 }
			
		 }
	           
	}

}
