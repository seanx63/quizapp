package com.genspark.quizapp.Entity;

import javax.persistence.*;

@Entity
public class CompletedQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private long completedQuizID;
    //TODO: create relationship between quiz.quizID and completedquiz.quizID

    @Column(nullable = false)
    private long quizID;

    @Column(nullable = false)
    private long score;

    @Column(nullable = false)
    private long userID;

    public CompletedQuiz() {
    }

    public CompletedQuiz(long completedQuizID, long quizID, long score, long userID) {
        this.completedQuizID = completedQuizID;
        this.quizID = quizID;
        this.score = score;
        this.userID = userID;
    }

    public long getCompletedQuizID() {
        return completedQuizID;
    }

    public void setCompletedQuizID(long completedQuizID) {
        this.completedQuizID = completedQuizID;
    }

    public long getQuizID() {
        return quizID;
    }

    public void setQuizID(long quizID) {
        this.quizID = quizID;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
