package com.akechiko.demo1;

public class Student {
    String No;
    String Name;
    int score;

    public Student() {
    }

    public Student(String no, String name, int score) {
        No = no;
        Name = name;
        this.score = score;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0){
            throw new NoScoreException("分数不能为负数："+score);
        }
        this.score = score;
    }

    public class NoScoreException extends RuntimeException{
        public NoScoreException() {
        }

        public NoScoreException(String message) {
            super(message);
        }
    }
}

