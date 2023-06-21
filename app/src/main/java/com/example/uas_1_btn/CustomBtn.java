package com.example.uas_1_btn;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomBtn extends AppCompatButton {
    private boolean isClicked;

    private void init(){
        // default
        isClicked = false;
        setBackgroundColor(Color.YELLOW);
        setTextColor(Color.RED);

        // event to change color
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked){
                    setBackgroundColor(Color.RED);
                    setTextColor(Color.YELLOW);
                    isClicked = false;
                }else {
                    setBackgroundColor(Color.YELLOW);
                    setTextColor(Color.RED);
                    isClicked = true;
                }
            }
        });
    }

    public CustomBtn(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomBtn(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomBtn(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
