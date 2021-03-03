package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase3_side1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_side1);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("You have started a fire and the fire felt warm and for that your coldness has worn off. After an hour you noticed that the " +
                " rain is starting to stop. What is your next move?");

        txtAnswer.setText("Decision 1: You slept for the night and wait until sunrise. \n \n " +
                "Decision 2: You decided to move and grab a stick with a cloth on it in order to make a torch to lighten up your way.");


    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(phase3_side1.this, loseScreen.class);
        Intent l = new Intent(phase3_side1.this, phase4_side1.class);


        if (v.getId() == R.id.btn1) {
            switch(v.getId()) {
                case R.id.btn1:
                    startActivity(i);
                    break;
            }

        }
        else if (v.getId() == R.id.btn2) {
            switch (v.getId()) {
                case R.id.btn2:
                    startActivity(l);
                    break;
            }
        }
    }
}