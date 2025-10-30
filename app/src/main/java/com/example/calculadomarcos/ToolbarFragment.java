package com.example.calculadomarcos;

import android.content.Context;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private int seek_value_ = 0;

    public ToolbarFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_toolbar,container,false);
        SeekBar seekBar = view.findViewById(R.id.seekBar3);
        seekBar.setOnSeekBarChangeListener(this);
        Button button = view.findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClickded(view);
            }
        });
        return view;
    }

    public void ButtonClickded(View view){
        activity_callback_.onButtonClick(seek_value_);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seek_value_ = progress;
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    public interface ToolbarFragmentListener{
        public void onButtonClick(int value);
    }
    ToolbarFragmentListener activity_callback_;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            activity_callback_ = (ToolbarFragmentListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }
}