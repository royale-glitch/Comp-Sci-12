import java.util.*;

public class ProgEx3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		drawLine(length);
		String input = in.nextLine();
		drawSign(input);

	}//main
	
	public static void drawLine(int length) {
		System.out.print("+");
		for(int i = 0;i < length; i++) {
			System.out.print("-");
		}
		System.out.print("+");
		
	}//drawLine
	
	public static void drawSign(String input) {
		int inLength = input.length();
		drawLine(inLength);
		System.out.println("| " + input + "|");
		drawLine(inLength);
		
		
	}//drawLine

}
