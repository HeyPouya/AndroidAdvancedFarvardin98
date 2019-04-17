package com.sematec.bootcamp.eight.androidadvancedfarvardin98;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class TestButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.txt)
    TextView txt;

    ArrayList<String> myList;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_butter_knife);
        ButterKnife.bind(this);

        txt.setText("Pouya Heydari");

        myList = new ArrayList<>();


    }


    @OnClick(R.id.txtClick)
    void clickedOnText() {
        Toast.makeText(this, "Clicked!!!", Toast.LENGTH_SHORT).show();
    }

}
