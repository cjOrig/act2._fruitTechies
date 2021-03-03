package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase4_side2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_side2);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("You manage to cross in the other side of the cliff. as you approach the village the bleeding on your left arm is getting worse and worse" +
                ". As you hurry going to the village you saw a carriage with four people in it. they were kinda suspicious because they have guns and swords." +
                " You were really in pain and you hope that you can ask them a ride back to the village. What is your next move?");

        txtAnswer.setText("Decision 1: You decided to ask them and give you a lift.\n \n" +
                "Decision 2: You waited for them to pass by and acted you were alright because you don't trust them.");


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(phase4_side2.this, loseScreen.class);
        Intent l = new Intent(phase4_side2.this, winScreen.class);


        if (v.getId() == R.id.btn1) {
            switch (v.getId()) {
                case R.id.btn1:
                    startActivity(l);
                    break;
            }

        } else if (v.getId() == R.id.btn2) {
            switch (v.getId()) {
                case R.id.btn2:
                    startActivity(i);
                    break;
            }
        }

    }
}
