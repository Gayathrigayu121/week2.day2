package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		 String text1="";
		String[] str=text.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					if (count>1) {
					 text1=text.replaceAll(str[j],""); 
					}
				
				}
			}
			
		}
		System.out.println(text1);
	}

}
