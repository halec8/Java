
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VarDeclarations();
		LoopImplementation();	
	}
	
	public static void VarDeclarations()
	{
		String haveString = "I have ";
		String  totalKids = "3 kids ";
		String totalAnimals = "1 dog ";
		String andString = "and ";
		String coolString ="ins't that cool?";
		
		System.out.println(haveString + totalKids + andString + totalAnimals + coolString);
		
		
	}
	
	public static void LoopImplementation()
	{
		int i = 0;
		
		while(i <= 100)
		{
			System.out.println(i);
			
			i++;
		}
	}

}
            	