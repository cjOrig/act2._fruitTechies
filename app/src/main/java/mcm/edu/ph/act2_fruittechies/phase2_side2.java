package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase2_side2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2_side2);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("You forced yourself to walk and found a stick to guide you along your way. After an 30 min of walking, you saw small shiny " +
                " lights and started to gain hope because you found a nearby village but unfortunately because of the heavy rain the ground suddenly felt collapsing " +
                " and that cause a landslide. After that landslide, you have another injury. A branch is stuck on your left arm and the bleeding wont stop. " +
                "what is your next step.");

        txtAnswer.setText("Decision1: You proceed because you felt like you can make it to the village not minding the pain.\n \n" +
                "Decision 2:  You pull out the branch and tries to stop the bleeding.");




    }





    @Override
    public void onClick(View v){
        Intent i = new Intent(phase2_side2.this, loseScreen.class);
        Intent j = new Intent(phase2_side2.this, phase3_side2.class);


        if (v.getId() == R.id.btn1) {
            switch(v.getId()) {
                case R.id.btn1:
                    startActivity(i);
                    break;
            }

        }
        else if (v.getId() == R.id.btn2){
            switch(v.getId()) {
                case R.id.btn2:
                    startActivity(j);
                    break;
            }

        }



    }
}