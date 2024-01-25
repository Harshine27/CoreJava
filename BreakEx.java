
public class BreakEx {

	public static void main(String[] args) { // break
		
		for(int i = 1; i<=20; i = i+2 ) {
			
			if(i == 9) {
				
				break;
				
				
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("after the loop stmts");
	}

}
