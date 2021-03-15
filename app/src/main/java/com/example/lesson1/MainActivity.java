package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        Button buttonOpen = findViewById(R.id.buttonOpen);
        buttonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView viewNumber = findViewById(R.id.viewNumber);
                viewNumber.setText("qwertyu");
            }
        });//Слушатель события нажатия на кнопку
    }

//    public void onClickButtonOpen(View view){
//        TextView viewNumber = findViewById(R.id.viewNumber);
//        viewNumber.setText("Number one");
//    }
}