package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaController2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText Ed1 = findViewById(R.id.editTextTextPersonName2);
        EditText Ed2 = findViewById(R.id.editTextTextPersonName);
        Button b = findViewById(R.id.button);
        TextView t = findViewById(R.id.textView2);



        //اكتب كود تفعيل الزر هنا


b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        int num1 = Integer.parseInt(Ed1.getText().toString());
        int num2 = Integer.parseInt(Ed2.getText().toString());

        int result = num1 + num2;

        t.setText(String.valueOf(result));
    }
});
    }
}