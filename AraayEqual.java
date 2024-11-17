package ArraysProgram;

import java.util.Arrays;

public class AraayEqual {

	public static void main(String[] args) {
		
		int roll[] = new int [4];
		roll[0]= 45;
		roll[1]= 63;
		roll[2]= 85;
		roll[3]= 78;
		int roll1[] = new int [4];
		roll1[0]= 42;
		roll1[1]= 62;
		roll1[2]= 87;
		roll1[3]= 8;
		boolean a1 = Arrays.equals(roll, roll1);
		System.out.println(a1);

	}

}
