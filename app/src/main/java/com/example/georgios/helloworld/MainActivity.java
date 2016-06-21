package com.example.georgios.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;

        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        displayForTeamA(solution);
    }

    public void showPicture(View v){
        displayForTeamA(100);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView)findViewById(R.id.display_text_view);
        scoreView.setText(String.valueOf(score));
        //t.setText(""+i);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        String firstName = "Georgios";
//        String Name = firstName + "Chal";
//        displayName(Name);
//    }
//    public void displayName(String i) {
//        TextView t = (TextView)findViewById(R.id.display_text_view_1);
//        t.setText(""+i);
//    }

}
