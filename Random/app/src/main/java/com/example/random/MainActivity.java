package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    TextView chosennumber;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        e1 = findViewById(R.id.count);
        chosennumber = findViewById(R.id.chosennumber);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e1.getText().toString();
                str = str.trim();
                int number = Integer.parseInt(str);
                int chosenNumer = random.nextInt(number) + 1;
                chosennumber.setText(Integer.toString(chosenNumer));
            }
        });
    }
}