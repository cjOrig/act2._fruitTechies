package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phase2_side1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase2);

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        txtDisplay.setText("You found a cave to shelter in but it is a bit cold and you saw some traces of recent campfire and saw some tools." +
                " What is your next move?");
        txtAnswer.setText("Decision 1: You  want to start a fire made out of wood and some rock.\n \n" +
                "Decision 2: You thought that making fire would be a waste of time so u proceed on foot ina rainy weather.");

    }

    @Override
    public void onClick(View v) {
        Intent f = new Intent(phase2_side1.this, phase3_side1.class);
        Intent k = new Intent(phase2_side1.this, loseScreen.class);


        if (v.getId() == R.id.btn1) {
            switch(v.getId()) {
                case R.id.btn1:
                    startActivity(f);
            }

        }
        else if (v.getId() == R.id.btn2){
            switch(v.getId()) {
                case R.id.btn2:
                    startActivity(k);
            }

        }




    }
}