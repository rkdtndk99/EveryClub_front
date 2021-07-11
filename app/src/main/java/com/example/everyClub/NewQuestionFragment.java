package com.example.everyClub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class NewQuestionFragment extends Fragment {
    private View view;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.new_question, container, false);
        view.findViewById(R.id.write_q).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyClubActivity)getActivity()).setFrag(2);
            }
        });
        return view;
    }
}