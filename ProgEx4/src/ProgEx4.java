import java.util.*;

public class ProgEx4 {
	static int [][] friends = new int [50][50];
	
	public static void main(String[] args) {
		friends [2][6] = 1;
		friends [6][2] = 1;
		friends [6][1] = 1; 
		friends [1][6] = 1; 
		friends [6][7] = 1;
		friends [7][6] = 1;
		friends [6][5] = 1;
		friends [5][6] = 1;
		friends [6][4] = 1;
		friends [4][6] = 1;
		friends [6][3] = 1;
		friends [3][6] = 1;
		friends [3][5] = 1;
		friends [5][3] = 1;
		friends [3][4] = 1;
		friends [4][3] = 1;
		friends [4][5] = 1;
		friends [5][4] = 1;
		friends [7][8] = 1;
		friends [8][7] = 1;
		friends [9][8] = 1;
		friends [8][9] = 1;
		friends [9][10] = 1;
		friends [10][9] = 1;
		friends [10][11] = 1;
		friends [11][10] = 1;
		friends [11][12] = 1;
		friends [12][11] = 1;
		friends [12][13] = 1;
		friends [13][12] = 1;
		friends [12][9] = 1;
		friends [9][12] = 1;
		friends [13][14] = 1;
		friends [14][13] = 1;
		friends [12][11] = 1;
		friends [13][15] = 1;
		friends [15][13] = 1;
		friends [15][3] = 1;
		friends [3][15] = 1;
		friends [18][16] = 1;
		friends [16][18] = 1;
		friends [17][16] = 1;
		friends [16][17] = 1;
		friends [18][17] = 1;
		friends [17][18] = 1;
		
		handling(friends);
	}//main
	
	public static void handling(int [][] friends) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if(input.equals("q")) {
			System.exit(0);
		} else if 
		
		
	}//handling

}//ProgEx4
