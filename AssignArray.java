package ArraysProgram;

import java.util.Arrays;

public class AssignArray {

	public static void main(String[] args) {
		
		int roll[] = new int[2];
		roll[0] = 45;
		roll[1] = 58;
		int roll1= 58;
		
		for(int i =0; i <roll.length;i++) {
		
		if(roll1 == roll[i]) {
		System.out.println("ipresent in the array");	
		}
		else {
			System.out.println("not present in the array");	
		}
		
		}
	}

}
