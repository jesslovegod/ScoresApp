package android.example.rugbyunionscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }

    public void addFiveForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA( scoreTeamA );
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA( scoreTeamA );
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA( scoreTeamA );
    }

    public void subtractThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA( scoreTeamA );
    }


    public void addFiveForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB( scoreTeamB );
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB( scoreTeamB );
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB( scoreTeamB );
    }

    public void subtractThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB( scoreTeamB );
    }


    /**
     * Resets the score for both Team back to 0;
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Display the given score for Team A
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( scoreTeamA ) );

    }

    /**
     * Display the given score for Team B
     */

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById( R.id.team_b_score );
        scoreView.setText( String.valueOf( scoreTeamB ) );
    }
}
