package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA (scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void score6TeamA (View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA (scoreTeamA);
    }

    public void score3TeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }

    public void score2TeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA (scoreTeamA);
    }

    public void score1TeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void score6TeamB (View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB (scoreTeamB);
    }

    public void score3TeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

    public void score2TeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB (scoreTeamB);
    }

    public void score1TeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    public void resetScores (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

}
