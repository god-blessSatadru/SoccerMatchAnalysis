package com.example.android.soccermatchanalysis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int mGoalScoredByBarcelona = 0;
    int mGoalScoredByRealMadrid = 0;
    int mFoulByBarcelona = 0;
    int mFoulByRealMadrid = 0;
    TextView mShowGoalBarcelona,mShowGoalRealMadrid,mShowFoulBarcelona,mShowFoulRealMadrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowGoalBarcelona  = (TextView) findViewById(R.id.show_goal_FC_Barcelona);
        mShowGoalRealMadrid = (TextView) findViewById(R.id.show_goal_Real_Madrid);
        mShowFoulBarcelona = (TextView) findViewById(R.id.show_foul_FC_Barcelona);
         mShowFoulRealMadrid = (TextView) findViewById(R.id.show_foul_Real_Madrid);
        Button mAddGoalBarcelona = (Button) findViewById(R.id.add_goal_Scored_FC_Barcelona);
        Button mAddGoalRealMadrid = (Button) findViewById(R.id.add_goal_Scored_Real_Madrid);
        Button mAddFoulBarcelona = (Button) findViewById(R.id.add_foul_Committed_Barcelona);
        Button mAddFoulRealMadrid = (Button) findViewById(R.id.add_foul_Committed_Real_Madrid);
        Button mReset = (Button) findViewById(R.id.reset);
        mAddGoalBarcelona.setOnClickListener(this);
        mAddGoalRealMadrid.setOnClickListener(this);
        mAddFoulBarcelona.setOnClickListener(this);
        mAddFoulRealMadrid.setOnClickListener(this);
        mReset.setOnClickListener(this);
        //add listener to the reset button
        // handle its click events


    }
    public void onClick (View view)
    {
        switch (view.getId())
        {
            case R.id.add_goal_Scored_FC_Barcelona:
                mShowGoalBarcelona.setText("" + (++mGoalScoredByBarcelona));
                break;
            case R.id.add_goal_Scored_Real_Madrid:
                mShowGoalRealMadrid.setText(""+ (++mGoalScoredByRealMadrid));
                break;
            case R.id.add_foul_Committed_Barcelona:
                mShowFoulBarcelona.setText(""+ (++mFoulByBarcelona));
                break;
            case R.id.add_foul_Committed_Real_Madrid:
                mShowFoulRealMadrid.setText(""+ (++mFoulByRealMadrid));
                break;
            case R.id.reset:
                mShowGoalBarcelona.setText("" + (mGoalScoredByBarcelona=0));
                mShowGoalRealMadrid.setText(""+ (mGoalScoredByRealMadrid=0));
                mShowFoulBarcelona.setText(""+ (mFoulByBarcelona=0));
                mShowFoulRealMadrid.setText(""+ (mFoulByRealMadrid=0));

        }
    }
}
