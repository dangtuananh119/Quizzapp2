package com.example.quizzapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;


public class AnswerFragment extends Fragment {

    private Questions mQuestion = new Questions();
    private TextView flagView;
    private TextView mQuestionView;
    private RelativeLayout true_btn;
    private RelativeLayout false_btn;
    private int mFlag = 0;
    public static int mScore = 0;
    int totalQuestion = Questions.mQuestions.length;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_answer, container, false);

        mQuestionView = view.findViewById(R.id.question);
        true_btn = view.findViewById(R.id.true_btn);
        false_btn = view.findViewById(R.id.false_btn);
        flagView = view.findViewById(R.id.flag);

        update(mFlag);

        true_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Objects.equals(getAnswer(mFlag), "true")){
                    mScore++;
                }
                mFlag++;
                update(mFlag);
            }
        });
        false_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Objects.equals(getAnswer(mFlag), "false")){
                    mScore++;
                }
                mFlag++;
                update(mFlag);
            }
        });
        return view;
    }

    private void update(int flag){
        if (flag == totalQuestion) {
            Bundle result = new Bundle();
            result.putInt("score", mScore);
            getParentFragmentManager().setFragmentResult("SCORE", result);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new ResultFragment()).commit();
            mScore = 0;
            mFlag = 0;
        }else {
            mQuestionView.setText(mQuestion.getQuestion(flag));
            flag++;
            flagView.setText("" + flag);
        }
    }

    private String getAnswer(int flag) {
        return mQuestion.getCorrectAnswer(flag);
    }
}
