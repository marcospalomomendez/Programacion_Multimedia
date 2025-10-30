package com.example.calculadomarcos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {

    public ImageView image_;

    public ImageFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image,container,false);
        image_ = view.findViewById(R.id.imageView);
        return view;
    }
    public void ChangeImageAlpha(int alpha){
        int t_value = alpha * 255 / 100;
        image_.setImageAlpha(t_value);
    }
}