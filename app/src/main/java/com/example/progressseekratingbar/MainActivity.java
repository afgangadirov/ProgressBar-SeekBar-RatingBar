package com.example.progressseekratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonBasla, buttonDayan, buttonEsas;
    private ProgressBar progressBar;
    private TextView textViewNetice;
    private SeekBar seekBar;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBasla = findViewById(R.id.buttonBasla);
        buttonDayan = findViewById(R.id.buttonDayan);
        buttonEsas = findViewById(R.id.buttonEsas);
        progressBar = findViewById(R.id.progressBar);
        textViewNetice = findViewById(R.id.textViewNetice);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);


        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        buttonDayan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textViewNetice.setText("Netice: "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        buttonEsas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float gelenReytinq = ratingBar.getRating();
                int gelenIlerleme = seekBar.getProgress();

                Log.e("Ratingimiz",String.valueOf(gelenReytinq));
                Log.e("Ilerlememiz", String.valueOf(gelenIlerleme));
            }
        });
    }
}