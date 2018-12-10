package com.leo.cyber2021ex03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private int clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        clicks = 0;
    }

    public void onButtonClick(View view) {
        clicks++;
        if (clicks > 6) {
            clicks = 0;
            button.setText("Enough clicks. From the top!");
        } else
            button.setText("Click number: " + clicks);
    }
}
