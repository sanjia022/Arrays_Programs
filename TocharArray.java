package ArraysProgram;

import java.util.Arrays;

public class TocharArray {

	public static void main(String[] args) {

    String name = "Dalia1";
    char[] n1 =  name.toCharArray();
    System.out.println(Arrays.toString(n1));
    
//    boolean alpha1 = Character.isAlphabetic(n1[0]);
//   boolean alpha2 =  Character.isAlphabetic(n1[1]);
    
   for(int i= 0; i <name.length(); i++) {
	   boolean alpha1 = Character.isAlphabetic(n1[i]);  
	   System.out.println(alpha1);
   }
   for(int i= 0; i <name.length(); i++) {
	   boolean alpha1 = Character.isDigit(n1[i]);  
	   System.out.println(alpha1);
   }
   for(int i= 0; i <name.length(); i++) {
	   boolean alpha1 = Character.isSpaceChar(n1[i]);  
	   System.out.println(alpha1);
   }

}}
