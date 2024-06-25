package com.project.quizApp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
	public QuestionWrapper(Integer quesid, String questionTitle, String option1, String option2, String option3,
			String option4) {
		super();
		this.quesid = quesid;
		this.questionTitle = questionTitle;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	private Integer quesid;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
}
