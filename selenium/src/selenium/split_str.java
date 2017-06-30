package selenium;

public class split_str {

	public static void main(String[] args) {
		 String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
		    String[] arrSplit_2 = strMain.split(", ");
		    for (int i=0; i< arrSplit_2.length; i++){
		      System.out.println(arrSplit_2[i]);
		    }
		String s1 = "pra tap";
		String s2 = "red dy";
		String[] s11 = s1.split(" ");
		String[] s12 = s2.split(" ");
		
		//String s111[] = new String []{s11, s12};
		
		String s13  = String.join(",", s11);
		System.out.println(s13);
		//System.out.println(s12[]);
		for( int i = 0; i < s11.length; i++)
		{
		System.out.println(s11[i]);
		
		}
		

	}

}
