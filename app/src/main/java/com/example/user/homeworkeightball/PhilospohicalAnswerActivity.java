package com.example.user.homeworkeightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by user on 16/08/2016.
 */
public class PhilospohicalAnswerActivity extends AppCompatActivity {

    TextView mAnswerText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophical_answers);

        mAnswerText = (TextView)findViewById(R.id.answer_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        mAnswerText.setText(answer);
    }

    public String randomPhrase(){
        String[] options = {
                "A man with one watch knows what time it is; a man with two watches is never quite sure.",
                "Only that in you which is me can hear what I'm saying.",
                "If a man who cannot count finds a four-leaf clover, is he lucky?",
                "To learn something new, take the path that you took yesterday.",
                "If you chase two rabbits, you will not catch either one.",
                "It would be a very big book that contained all the maybes uttered in a day.",
                "He who depends on another man's table often dines late.",
                "It's always Now.",
                "Eggs cannot be unscrambled.",
                "The future influences the present just as much as the past."
        };
        Random rand = new Random();
        int index = rand.nextInt(options.length);
        return options[index];
    }
}
