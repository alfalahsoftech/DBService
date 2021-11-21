import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.coundFreqOfWord();


	}

	public File readFile() {

		File file = new File(this.getClass().getClassLoader().getResource("sample.txt").getFile());
		System.out.println("File exists? " + file.getAbsolutePath());
		return file;
	}

	public void coundFreqOfWord() {
		File file = this.readFile();
		HashMap<String,Integer> wordFreqHash = new HashMap<String, Integer>();
		try(BufferedReader bfr1 = new BufferedReader(new FileReader(file));) {
			
			String line = bfr1.readLine();
			System.out.println("Line: "+ line);
			while(line != null) {
				String wordsArray[] = line.split(" ");
//				System.out.println("wordsArray = "+ wordsArray);
				for (int i = 0; i < wordsArray.length; i++) {
					String word  =wordsArray[i];
					Integer count = wordFreqHash.getOrDefault(word,0);
					wordFreqHash.put(word,++count);
				}
				line = bfr1.readLine();
			}

		} catch (IOException e ) {
			e.printStackTrace();
			
		}
		sortMap(wordFreqHash);
	}
	
	public void sortMap(HashMap<String,Integer> wordMap) {
		System.out.println(wordMap);
		Iterator<Map.Entry<String, Integer>> i = wordMap.entrySet().iterator();
		int max = 0;
		String val = "";
		while(i.hasNext()) {
			Map.Entry<String, Integer> e = i.next();
			Integer v = e.getValue();
		
			if(v.intValue() > max) {
				max = v;
				val = e.getKey();
			}
			
		}
		System.out.println("Word:  "+ val + " Count: " + max );
		
//		wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
//		.collect(Collectors.toMap());
		
		
	}


}
