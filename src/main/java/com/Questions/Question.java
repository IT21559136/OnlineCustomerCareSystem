package com.Questions;

public class Question {
	private int id;
	private String username;
	private String category;
	private String question;
	private String answers;
	//create constructor for assign values to private variables
	public Question(int id, String username, String category, String question, String answers) {
		
		this.id = id;
		this.username = username;
		this.category = category;
		this.question = question;
		this.answers = answers;
	}
	
	//implement getters to get values
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
	public String getAnswers() {
		return answers;
	}

	
	
	



}
