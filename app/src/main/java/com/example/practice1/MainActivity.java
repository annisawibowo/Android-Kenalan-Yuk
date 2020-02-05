package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int no = 0;
    private TextView mShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShow = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast muncul = Toast.makeText(this,"Halo Kawan", Toast.LENGTH_SHORT);
        muncul.show();
        mShow.setText("Who?");
    }

    @SuppressLint("SetTextI18n")
    public void countup(View view) {
        no++;
        if (no == 1){
            mShow.setText("Annisa");
        }
        if (no==2){
            mShow.setText("Raudya");
        }
        if (no==3){
            mShow.setText("Wibowo");
            no=0;
        }



    }
}
