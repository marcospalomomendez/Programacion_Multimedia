package com.example.calculadomarcos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;

public class MainActivity2 extends FragmentActivity implements ToorbarFragment1.ToolbarListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConstraintLayout n = findViewById(R.id.main);


/*
        Button button = findViewById(R.id.button);

        TextView t3 = findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.setText("On Click");
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                t3.setText("On Long Click");
                return true;
            }
        });
        ConstraintLayout m = findViewById(R.id.main);
        m.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                HandleTouchEvent(v, event);
                return false;
            }
        });
    }

    public void HandleTouchEvent(View v, MotionEvent me) {
        TextView t1 = findViewById(R.id.textView);
        TextView t2 = findViewById(R.id.textView2);

        int pointerCount = me.getPointerCount();

        for (int i = 0; i < pointerCount; i++) {
            int x = (int) me.getX();
            int y = (int) me.getY();

            int id = me.getPointerId(i);

            int action = me.getActionMasked();

            int actionIndex = me.getActionIndex();

            String actionName;

            switch (action) {
                case MotionEvent.ACTION_UP:
                    actionName = "UP";
                    break;
                case MotionEvent.ACTION_DOWN:
                    actionName = "DOWN";
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionName = "PTR_UP";
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionName = "PTR_DOWN";
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionName = "MOVE";
                    break;
                default:
                    actionName = "";
                    break;
            }

            String touchStatus = "Action: " + actionName + " Index: " + actionIndex + " ID: " + id + " X: " + x + " Y: " + y;

            if (id == 0) {
                t1.setText(touchStatus);
            } else {
                t2.setText(touchStatus);
            }

        }
        */

    }

    @Override
    public void onButtonClick(int size, String text) {
       TextFragment1 textFragment = (TextFragment1) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView3);

       if(textFragment != null){

           textFragment.changeTextProperties(size, text);
       }
    }
}
