package com.genspark.quizapp.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {
    public Quiz() {
    }

    public Quiz(long quizID, String category, quizCategory question) {
        this.quizID = quizID;
        this.category = category;
        this.question = question;
    }

    private enum quizCategory {
        HISTORY,
        POPCULTURE,
        GEOGRAPHY
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quizID;
    private String category;
    private quizCategory question;

    public long getQuizID() {
        return quizID;
    }

    public void setQuizID(Integer quizID) {
        this.quizID = quizID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public quizCategory getQuestion() {
        return question;
    }

    public void setQuestion(quizCategory question) {
        this.question = question;
    }
}
