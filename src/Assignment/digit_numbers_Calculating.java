package Assignment;

public class digit_numbers_Calculating 
{
	public static void main(String[]args)
	{
		//Now Test the how many characters and numbers
				String input ="Rahim123456";
				int charactercount=0;
				int numbercount=0;
				System.out.println("Total laters is="+input.length());
				
				for(char ch:input.toCharArray())
				{
					if (Character.isLetter(ch))
					{
						charactercount++;
						
					}
					else if (Character.isDigit(ch))
					{
						numbercount++;
					}
					
				}		
				System.out.println("Total charecters="+charactercount);
				System.out.println("Total numbercount="+numbercount);
				
			}

}
