package com.example.quizzapp2;

public class Questions {
    public static String mQuestions[] = {
            "1 + 1 = 2",
            "2 + 2 = 4",
            "3 + 3 = 5",
            "4 + 4 = 8",
            "5 + 5 = 10"
    };

    private String mCorrectAnswers[] = {"true", "true","false", "true", "true"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
