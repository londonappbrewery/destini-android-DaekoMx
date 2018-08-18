package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button btnTop, btnBottom;
    private TextView tvStory;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        btnTop = findViewById(R.id.buttonTop);
        btnBottom = findViewById(R.id.buttonBottom);
        tvStory = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    btnTop.setText(R.string.T3_Ans1);
                    tvStory.setText(R.string.T3_Story);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 2;
                } else if (mStoryIndex == 2){
                    btnTop.setText(R.string.T3_Ans1);
                    tvStory.setText(R.string.T3_Story);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                } else if (mStoryIndex == 3){
                    tvStory.setText(R.string.T6_End);
                    gameOver();
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    btnTop.setText(R.string.T2_Ans1);
                    tvStory.setText(R.string.T2_Story);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                }else if(mStoryIndex == 2) {
                    tvStory.setText(R.string.T4_End);
                    gameOver();
                }else if(mStoryIndex == 3){
                    tvStory.setText(R.string.T5_End);
                    gameOver();
                }
            }
        });

    }


    private void gameOver(){
        btnBottom.setVisibility(View.GONE);
        btnTop.setVisibility(View.GONE);
    }

}
