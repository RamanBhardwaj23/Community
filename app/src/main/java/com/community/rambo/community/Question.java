package com.community.rambo.community;



public class Question {
    String Id;
    String Question;
    public Question(){

    }

    public Question(String Id, String question) {
        this.Id = Id;
        this.Question = question;
    }

    public String getId() {
        return Id;
    }

    public String getQuestion() {
        return Question;
    }
}



