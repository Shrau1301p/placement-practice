package NqtPractice;
import java.util.ArrayList;
public class practice {
	static boolean encode(String word){
		if(word.isEmpty()) {
			return true;
		}
		boolean flag = false;
		word = word.toLowerCase();
		ArrayList<Integer> arr = new ArrayList<>(); 
	    for(int i=0; i< word.length();i++) {
	    	int count=0;
	    	for(int j=0; j< word.length();j++) {
	    		if(word.charAt(i) == word.charAt(j)) {
	    			count++;
	    		}	
	    	}
	    	arr.add(count);
	    }
	    for (Integer a : arr) {
			if(a != 1)
				return false;
		}
		return true;
	 }
	public static void main(String[] args) {
		System.out.println(encode("isIsogram"));
		System.out.println(encode("moose"));
		System.out.println(encode("Dermatoglyphics"));
		System.out.println(encode("aba"));
		System.out.println(encode("moOse"));
		System.out.println(encode(""));
		System.out.println(encode("thumbscrewjapingly"));
	}

}
