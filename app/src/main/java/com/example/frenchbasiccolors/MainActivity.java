package com.example.frenchbasiccolors;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button blackButton = findViewById(R.id.blackButt);
        Button yellowButt = findViewById(R.id.YellowButt);
        Button purpleButt = findViewById(R.id.PurpleButt);
        Button redButt = findViewById(R.id.redButt);
        Button greenButt = findViewById(R.id.greenButt);

        blackButton.setOnClickListener(this);
        yellowButt.setOnClickListener(this);
        purpleButt.setOnClickListener(this);
        redButt.setOnClickListener(this);
        greenButt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        int clickedColor = v.getId();

        if(clickedColor == R.id.blackButt){
            PlaySounds(R.raw.black);
        }
        else if(clickedColor == R.id.YellowButt)
        {
            PlaySounds(R.raw.yellow);
        }
        else if(clickedColor == R.id.PurpleButt)
        {
            PlaySounds(R.raw.purple);
        }
        else if(clickedColor == R.id.redButt)
        {
            PlaySounds(R.raw.red);
        }
        else if(clickedColor == R.id.greenButt)
        {
            PlaySounds(R.raw.green);
        }
    }

    public void PlaySounds(int id)
    {
        //we insert the id instead of the manual button ID itself since we are passing the id
        MediaPlayer frenchPlayer = MediaPlayer.create(this,id);
        frenchPlayer.start();

    }
}