package com.genspark.quizapp.Entity;


import javax.persistence.*;

@Entity
public class Quiz {
    public Quiz() {
    }

    public Quiz(long quizID, quizCategory category, String question) {
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
    @Column(nullable = false, updatable = false, unique = true)
    private long quizID;

    @Column(nullable = false)
    private quizCategory category;

    @Column(nullable = false, unique = true)
    private String question;

    public long getQuizID() {
        return quizID;
    }

    public void setQuizID(Integer quizID) {
        this.quizID = quizID;
    }

    public quizCategory getCategory() {
        return category;
    }

    public void setCategory(quizCategory category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}