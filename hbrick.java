package hearth;

import java.util.Scanner;

public class hbrick {

	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		int brick = S.nextInt();
		int round = 1;
		while(brick>0) {
			brick = brick-round;
			if (brick <0) {
				System.out.println("patlu");
				break;
			}
			brick = brick-2*round;
			if(brick <0) { 
				System.out.println("motu");
				break;
			}
			round++;
		}

	}

}
