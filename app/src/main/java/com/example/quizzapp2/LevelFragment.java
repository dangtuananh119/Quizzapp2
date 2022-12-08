package com.example.quizzapp2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class LevelFragment extends Fragment {

    RelativeLayout hard_btn,medium_btn,easy_btn;
    Fragment answerFragment = new AnswerFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_level, container, false);


        hard_btn =  view.findViewById(R.id.hard_btn);
        medium_btn =  view.findViewById(R.id.medium_btn);
        easy_btn =  view.findViewById(R.id.easy_btn);

        hard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, answerFragment).commit();
            }
        });

        medium_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, answerFragment).commit();
            }
        });

        easy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, answerFragment).commit();
            }
        });

        return view;
    }
}