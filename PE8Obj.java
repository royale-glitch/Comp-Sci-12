
public class PE8Obj {
	private String word;
	private int score;
	
	PE8Obj() {
		this.word = "";
		this.score = 0;
		
	}
		
	public PE8Obj(String myWord, int myScore){
		this.word = myWord;
		this.score = myScore;	
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	public String getWord() {
		return this.word;
	}
	
	public int getScore() {
		return this.score;
	}
	
	
}
