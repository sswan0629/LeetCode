package Easy;


//Given a column title as appear in an Excel sheet, return its corresponding column number.
public class ExcelSheetColNum171 {
	
	public static int titleToNumber(String s){
		
		
		String lowerS = s.toLowerCase();
		int len = lowerS.length(); 
		
		 
		
		int num = 0; 
		final int cycle = 26; 
		for(int i = 0; i < len; i++) {
			int ind = len - i - 1; 
			char ch = lowerS.charAt(i);
			int temp = getAlphabeticValue(ch);
			num += pow(cycle, ind) * temp;
		}
		return num;
	}
	
	private static int getAlphabeticValue(char ch){
		char a = 'a';
		int offset = ((int) a) - 1;
		return ((int) ch ) - offset;
		
	}
	
	public static int pow(int base, int exp){
		
		if(exp == 0) return 1;
		
		int res= base * pow(base, --exp);
		return res; 
		
		
	}
	
	public static void main(String[] args){
		String s ="AJHX";
		
		System.out.println(s + "\t" + titleToNumber(s));
		
		int base = 2;
		for(int i = 3; i >=0; i--)
		System.out.println(pow(base, i));
	
	}
	

}
