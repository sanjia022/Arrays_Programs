package ArraysProgram;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayFromScannerclass {

	public static void main(String[] args) {
		
		String name[] = new String[2];
		Scanner scanner = new Scanner(System.in);
		
		for(int i= 0; i<name.length; i++) {
		name[i] =scanner.next();
		
		}System.out.println(Arrays.toString(name));
	scanner.close();
	}
		
	}


