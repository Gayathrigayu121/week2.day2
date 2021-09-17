package week2.day2;

public class LearnsStrings {

	public static void main(String[] args) {
		
		String str="welcome to test leaf today";
		
		String [] str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			
			System.out.println("split["+i+"]:"+str1[i]);
		}

		//Substring
		String str2=str.substring(11);
		System.out.println();
		
		
		
		
		
	}

}
