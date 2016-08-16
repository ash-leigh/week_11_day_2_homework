package com.example.user.homeworkeightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by user on 16/08/2016.
 */
public class MainActivity extends AppCompatActivity {

    EditText mQuestionText;
    Button mShakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionText = (EditText)findViewById(R.id.question_text);
        mShakeButton = (Button)findViewById(R.id.shake_button);

        mShakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = philosophicalAnswer();
                String question = mQuestionText.getText().toString();

                Intent intent = new Intent(MainActivity.this, PhilospohicalAnswerActivity.class);
                intent.putExtra("answer", answer);
                startActivity(intent);
            }
        });
    }
    public String philosophicalAnswer(){
        PhilospohicalAnswerActivity phil = new PhilospohicalAnswerActivity();
        String var = phil.randomPhrase();
        return var;
    }
}
