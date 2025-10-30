package com.example.calculadomarcos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements ToolbarFragment.ToolbarFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    @Override
    public void onButtonClick(int value) {
        ImageFragment imageFragment = (ImageFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentImagen);

        if (imageFragment != null){
            imageFragment.ChangeImageAlpha(value);
        }
    }
}