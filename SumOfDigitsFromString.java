package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		String h=text.replaceAll("\\D","");
		System.out.println(h);
		char [] ch=h.toCharArray();
for(int i=0;i<ch.length;i++) {
int gh=Character.getNumericValue(ch[i]);
	sum=sum+gh;
}
System.out.println(sum);
	}

}
