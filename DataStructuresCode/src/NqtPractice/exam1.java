//we have to print the alphabet is not present in the given string 

package NqtPractice;

public class exam1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "I am shravani pathak from pune";
	    str = str.toLowerCase();
	    char[] alpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    for(int j=0; j < alpha.length;j++){
	        int count =0;
	        for(int i=0; i < str.length(); i++){
	              if(alpha[j] == str.charAt(i)){
	                  count++;
	              }
	  		}
	  		if(count == 0)
	  		    System.out.print(alpha[j]);
	    }
	}
}
