//

package NqtPractice;

import java.util.Scanner;

public class nqtQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int slices = scanner.nextInt();
		String player = scanner.next();
		int n = slices;
		int time =0;
		while(n > 0) {
			for(int i=0;i<n;i++) {
				if(i % n == 0) {
					n--;
					time++;
				}
			}
		}
		for(int i=0;i<time;i++) {
			if(player.equalsIgnoreCase("J")) {
				player = "T";
			} else {
				player = "J";
			}
		}
		
		if(player.equalsIgnoreCase("J")) {
			System.out.println("Winner: Tina");
		} else {
			System.out.println("Winner: James");
		}
	}

}
