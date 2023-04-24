package Answers;

public class Answers {

	private int id;
	private String username;
	private String category;
	private String question;
	private String answer;
	
	public Answers(int id, String username, String category, String question, String answer) {
		
		this.id = id;
		this.username = username;
		this.category = category;
		this.question = question;
		this.answer = answer;
		
		
		
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getCategory() {
		return category;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}


	
	
}
