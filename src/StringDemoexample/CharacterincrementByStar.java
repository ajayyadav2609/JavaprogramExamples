package StringDemoexample;
//replace a with star and increment by ** for 1st,*** for 2nd
public class CharacterincrementByStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="Javajava";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a')
			{
				count++;
				for(int z=0;z<=count;z++)
				{
					System.out.print("*");
				}
			}else
			{
				System.out.print(ch);
			}
			
				
		}
		
		}

}
