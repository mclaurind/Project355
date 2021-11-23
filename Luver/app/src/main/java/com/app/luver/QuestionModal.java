package com.app.luver;
public class QuestionModal {

    // variables for question number and question
    private String questionNum;
    private String question;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private int imgId;

    // creating getter and setter methods
    public String getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    // constructor.
    public QuestionModal(String questionNum, String question, int imgId) {
        this.questionNum = questionNum;
        this.question = question;
        this.imgId = imgId;
    }
}

