public class PE8Obj{
	private String word;
	private int score;
	
	//default constructor for initializing objects
	PE8Obj() {
		this.word = "";
		this.score = 0;		
	}
	
	public void setWord(String myWord) {
		this.word = myWord;
	}
	
	public void setScore(int myScore) {
		this.score = myScore;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public int getScore() {
		return this.score;
	}
	
}//PE8Obj