package week2.day2;

public class ReverseEvenWords {

	private static Object String;

	public static void main(String[] args) {

		String str="I am a software tester";
		String [] words=str.split(" ");
		String reversestring="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseword="";
			for (int j=word.length()-1;j>=0;j--) 
			{
				reverseword=reverseword+word.charAt(j);
			}
			reversestring=reversestring+reverseword+" ";
		}
		System.out.println(reversestring);
			}
				
			
}
