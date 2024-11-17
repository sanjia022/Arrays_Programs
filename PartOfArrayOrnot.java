package ArraysProgram;

import java.util.Arrays;
import java.util.Scanner;

public class PartOfArrayOrnot {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int a1 [] = new int[2] ;
		
		
		for(int i=0;i>a1.length;i++) {
		a1[i] = scanner.nextInt();
		System.out.println(Arrays.toString(a1));
		
		}
	
		scanner.close();
		String name = "ZAINA SHAHREEN";
		String old =name.substring(4, 8);
		 System.out.println(old);
	}
	
}
