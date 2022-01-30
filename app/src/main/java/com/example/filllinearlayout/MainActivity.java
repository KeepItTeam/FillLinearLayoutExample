package com.example.filllinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    ArrayList<EditText> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addElements(View view) {
        int num = Integer.parseInt(((EditText) findViewById(R.id.numberTextEdit)).getText().toString());
        layout = findViewById(R.id.editTexts);
        for (int i = 0; i < num; i++) {
            EditText et = new EditText(MainActivity.this);
            list.add(et);
            layout.addView(et);
        }

    }

    public void countSum(View view) {
        int sum = 0;
        for (EditText et : list
        ) {
            sum += Integer.parseInt(et.getText().toString());
        }
        ((TextView) findViewById(R.id.sumTextView)).setText(Integer.toString(sum));
    }
}