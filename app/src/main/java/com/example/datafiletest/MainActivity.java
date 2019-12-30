package com.example.datafiletest;

import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getListOfSpheres(View v) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("zygoAttributes.txt")));
            String currentLine = null;
            //Log.e("reader stuff", br.readline());
            while ((currentLine = br.readLine())!= null) {
                Toast toast = Toast.makeText(getApplicationContext(), currentLine, Toast.LENGTH_SHORT);
                toast.show();
            }/* else {
                Toast toast = Toast.makeText(getApplicationContext(), "DID NOT READ", Toast.LENGTH_SHORT);
                toast.show();
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
