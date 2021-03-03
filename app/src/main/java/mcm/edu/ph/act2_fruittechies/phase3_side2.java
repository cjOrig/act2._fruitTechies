package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase3_side2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase3_side2);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("You manage to stop the bleeding with a spare of handkerchief. After a while you proceed to follow the " +
                " lights of the village. As you come close towards the nearby village you encountered a deep cliff with only two bridge." +
                " The first bridge is a Log where it does'nt have ani side railings  to grab. The second bridge is a actual bridge but it look like " +
                "it is about to collapse. What is your decision?");
        txtAnswer.setText("Decision 1: You decide to cross the Log bridge because you feel you can handle your balance well.\n \n" +
                "Decision 2: You decide to stick to the collapsing bridge because you feel you can just run if ever the bridge will collapse");



    }




    @Override
    public void onClick(View v) {
        Intent i = new Intent(phase3_side2.this, loseScreen.class);
        Intent j = new Intent(phase3_side2.this, phase4_side2.class);

        if (v.getId() == R.id.btn1){
            switch(v.getId()) {
                case R.id.btn1:
                    startActivity(j);
                    break;
            }

        }
        else if (v.getId() == R.id.btn2) {
            switch (v.getId()) {
                case R.id.btn2:
                    startActivity(i);
                    break;
            }
        }
    }
}