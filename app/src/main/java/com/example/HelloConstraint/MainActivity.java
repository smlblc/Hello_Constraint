package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    private Button mCount;
    private Button mZero;
    private Button mToast;
    private TextView mCounterScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCount = findViewById(R.id.button_count);
        mZero = findViewById(R.id.button_zero);
        mCounterScreen = findViewById(R.id.show_count);

        mCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                mCounterScreen.setText(String.valueOf(mCounter));
            }
        });

        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                mCounterScreen.setText(String.valueOf(mCounter));
            }
        });

    }

    public void toastMessage(View view){
    Toast.makeText(this, "My Message", Toast.LENGTH_LONG).show();

    }
}