package coordinate;

import java.util.Scanner;

public class LineCoordinateUi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i=24; i>=-1; i--) {
			if (i == -1) {
				System.out.print("0" + "  ");
				for (int j=2; j<=24; j++) {
					if (j%2 == 0) {
						System.out.print("  " + j);
					}
				}
				continue;
			}
			if (i == 0) {
				System.out.print("  " + "+");
				for (int j=1; j<=24; j++) {
					System.out.print("ㅡ");
				}
				System.out.println();
				continue;
			}
			
			if (i%2 == 0) {
				if (i-10 >= 0) {
					System.out.println(i + "|");	
					continue;
				}
				
				if (i-10 < 0) {
					System.out.println(i + " |");	
					continue;
				}
			} 
			if (i%2 != 0) {
				System.out.println(" " + " |");
				continue;
			}
		}
	}
}
