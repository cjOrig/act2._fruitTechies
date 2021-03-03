package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase4_side1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase4_side1);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("As you proceed with light in hand your vision around you has improved. As you follow a trail, you found a highway" +
                " but as you approach the highway you heard a wolf howling and it is about to cross paths with you. What is your decision?");
        txtAnswer.setText("Decision 1: You decided to throw a rock at somewhere so that the wolf is distracted to where that sound is.\n \n" +
                "Decision 2: You decided to hide and wait until the wolf will leave.");





    }



    @Override
    public void onClick(View v) {

        Intent i = new Intent(phase4_side1.this, loseScreen.class);
        Intent l = new Intent(phase4_side1.this, winScreen.class);


        if (v.getId() == R.id.btn1) {
            switch(v.getId()) {
                case R.id.btn1:
                    startActivity(l);
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