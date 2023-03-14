package com.example.myapplication2.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.myapplication2.R;

public class DailyRecommendation extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.daily_recommendation_fragment, container, false);
        return root;
    }

}