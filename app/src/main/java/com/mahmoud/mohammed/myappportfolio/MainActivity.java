package com.mahmoud.mohammed.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run_movie(View view) {
        Toast.makeText(MainActivity.this,"run Movie App",Toast.LENGTH_SHORT).show();
    }
    public void run_stock(View view) {
        Toast.makeText(MainActivity.this,"run stocks App",Toast.LENGTH_SHORT).show();
    }
    public void run_build(View view) {
        Toast.makeText(MainActivity.this,"run Build It Bigger App",Toast.LENGTH_SHORT).show();
    }
    public void run_xyz(View view) {
        Toast.makeText(MainActivity.this,"run Xyz Readr App",Toast.LENGTH_SHORT).show();
    }
    public void run_wear(View view) {
        Toast.makeText(MainActivity.this,"run Go Ubiquitous App",Toast.LENGTH_SHORT).show();
    }
    public void run_capa(View view) {
        Toast.makeText(MainActivity.this,"run Capastone App",Toast.LENGTH_SHORT).show();
    }





}
