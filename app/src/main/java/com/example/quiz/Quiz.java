package com.example.quiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Random;

public class Quiz extends AppCompatActivity {
    public List<String> suggestSource = new ArrayList<>();
    public Button nextButton;
    public Button exitButton;
    public EditText et_answer;
    public TextView tv_score;
    public ImageView userImage;

   // Data data = new Data();
    //data.makeList();

    //ArrayList<Person> personList = data.getPersonList();
   // System.out.println(personList.size());


    public char[] answer;
    String correct_answer;
    int score = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        nextButton = (Button) findViewById(R.id.nextButton);
        exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Quiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
        et_answer = (EditText) findViewById(R.id.et_answer);
        tv_score = (TextView) findViewById(R.id.tv_score);
        userImage = (ImageView)findViewById(R.id.userImage);

        initView();
    }

   // Mediastore.media.getBitmap.this.getcontentResolver

    private void initView() {
       // Toast.makeText(getApplicationContext(), personList.size(), Toast.LENGTH_LONG).show();

       // setupList();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_answer.getText().toString().toLowerCase().equals(correct_answer.toLowerCase())){
                  score++;
                  total++;
                  Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
                  tv_score.setText(score + "/" + total);
                  //setupList();

                }else {
                    total++;
                    tv_score.setText(score + "/" + total);
                    Toast.makeText(getApplicationContext(), "Incorrect! \nThe correct answer is: "+correct_answer, Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    private void setupList() {
        Random random = new Random();

        //henter ut person
        // int index = random.nextInt(personList.size());

        // Person currentPerson = personList.get(1);

       // Toast.makeText(getApplicationContext(), personList.size(), Toast.LENGTH_LONG).show();


        //henter ut bilde
        // Uri currentUri = currentPerson.getUri();
        // userImage.setImageURI(currentUri);

        //henter navn
       // String name = currentPerson.getName();
       // correct_answer = name;

       // correct_answer = correct_answer.substring(correct_answer.lastIndexOf("/")+1);

       // answer = correct_answer.toCharArray();

       // suggestSource.clear();
       // for(char item:answer)
       // {
       //     suggestSource.add(String.valueOf(item));
       // }
       // Collections.shuffle(suggestSource);

    }

}