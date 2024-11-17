package ArraysProgram;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		String name = "David";
		
		
		
//		for(int i=name.length()-1; i>=0;i--) {
//			char a1 = name.charAt(i);
//			System.out.print(a1);
//			
//		}
		
		String name1 [] = new String[2];
		name1[0]= "Zaina";
		name1[1] = "Fayyaz";
		System.out.println(Arrays.toString(name1));
		for(int i= 0; i<name1.length; i++) {
		System.out.print(name1[i]);
		
		}
	}

}
