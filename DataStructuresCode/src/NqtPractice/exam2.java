//x is a distance between A and B point
//n1 is distance A trevalled per sec
//n2 is distance B trevalled per sec
// we have to find the sec in which a point B is ahead of point A
// if not possible return -1;

package NqtPractice;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int x=scanner.nextInt();
		int a = x, b=0, count=0;
		do {
			a = a+n1;
			b = b+n2;
			count++;
			
		}while(b > a);
		if(count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count);
		}
	}

}
