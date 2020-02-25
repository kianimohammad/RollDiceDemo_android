package com.w20.imageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dice1, dice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1 = findViewById(R.id.dice_1);
        dice2 = findViewById(R.id.dice_2);

        final int[] srcArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // choose a random number
                Random random = new Random();
                int leftDice = random.nextInt(6);
                int rightDice = random.nextInt(6);
                dice1.setImageResource(srcArray[leftDice]);
                dice2.setImageResource(srcArray[rightDice]);
            }
        });

    }
}
