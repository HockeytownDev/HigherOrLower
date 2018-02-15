package com.example.matt.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string)
    {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();

    }

    public void onClick(View view)
    {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());



        if(randomNumber > guessInt)
        {
            makeToast("Higher!");
        }else if(randomNumber < guessInt)
        {
            makeToast("Lower!");
        }else
        {
            makeToast("That's correct! Try again!");

            Random random = new Random();

            randomNumber = random.nextInt(20) + 1;

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        randomNumber = random.nextInt(20) + 1;
    }
}
