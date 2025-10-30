package com.example.calculadomarcos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment1 extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_text, container, false);

        textView = v.findViewById(R.id.textView4);

        return v;
    }

    public void changeTextProperties(int fontSize, String texto){
        if (textView != null){
            textView.setTextSize(fontSize);
            textView.setText(texto);
        }

    }
}