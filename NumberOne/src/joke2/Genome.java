package joke2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Genome {
	public static int GEENOME_SIZE = 1_000_000;
	public int M = 10;
    public static char [] letters = {'A','C','G','T'};	
	char[] sequence;
	
	public void generateSequence(){
		Random random = new Random();
		sequence = new char[GEENOME_SIZE];
		for (int i = 0; i< sequence.length;i++){
			sequence[i] = letters[random.nextInt(letters.length)];
		}
		
		
	}

	public void searchDuplicatesBruteForce(char [] data) {
	for (int i = 0; i < data.length-M; i++) {
		for (int j = i+1; j < data.length-(M+1); j++) {
			int k = i;
			int l =j;
			int n = 0;
			while(data[k++]==data[l++]&& ++n<M){
			}
			if(n==M){
				System.out.println("Match at "+ i+ " and "+j);
			}
		}
	}	
		
	}
	
	public void searchDuplicatesSorting(char[] data){
		List<String> words = new LinkedList<>();
		for(int i =0;i<data.length-M+1;i++ ){
			String word = new String(data,i,M);
			words.add(word);
		}
		
		Collections.sort(words);
		String last = " ";
		
		Iterator<String> it = words.iterator();
		while(it.hasNext()){
			String word = it.next();
			if(word.equals(last)){
				System.out.println("Match");
			}
			last =word;
		}
	}

	public static void main(String[] args) {
	Genome genome = new Genome();
	genome.generateSequence();
//	System.out.println(genome.sequence);
	//genome.searchDuplicatesBruteForce(genome.sequence);
	genome.searchDuplicatesSorting(genome.sequence);
}
}
