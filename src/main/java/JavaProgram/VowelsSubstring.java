package JavaProgram;

public class VowelsSubstring {
	


	
		public static void main(String[] args) {
			String x="AUTOMATION TESTING'S PERFORMANCE ACTIVITY";
			//char y[]=x.toCharArray();
			//int size=y.length;
			int size=x.length();
			int vowelcount=0;
			int constantcount=0;
			int specialcount=0;
			
			int i=0;
			while(i!=size)
			{
				if(x.charAt(i)>='A' && x.charAt(i)<='Z' )
				{
					if (x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U')
					{
						++vowelcount;
					}
				
				else 
				{
					++constantcount;
				}
				}
			      else
			
			    	  
			{
				
				++specialcount;
			}
			++i;
			
				}
				System.out.println(x.length());
				System.out.println("Vowelcount :" +vowelcount);
				System.out.println("Consonantcount :" +constantcount);
				System.out.println("Specialcount :" +specialcount);
				System.out.println(x.length());
				System.out.println("Vowelcount :" +vowelcount);
				System.out.println("Consonantcount :" +constantcount);
				System.out.println("Specialcount :" +specialcount);
				//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


	}
}
	
	/*
	 * RESULT; AUTOMATION TESTING'S PERFORMANCE ACTIVITY
	 *  Vowelcount :15
	 * Consonantcount :22 
	 * Specialcount :4
	 */
		
		
		