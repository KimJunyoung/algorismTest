package algorism_1;
import java.util.*;

public class algorisom_2 {
	
	public static String Cal(String str){
		String answer="";
		for(char x:str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else
			{
				answer += Character.toLowerCase(x);
			}
		}
		
		return answer;
	}


	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String kb = scanner.next();
		System.out.println(Cal(kb));
	}
	
	
}
