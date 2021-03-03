package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar();

        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        //phase 1 main question
        txtDisplay.setText("You suddenly woke up in a very dark forest and it was raining heavily. You started to feel like your right foot is injured" +
                " what will you do next?");

        txtAnswer.setText("Decision 1: You decided to find a place where you can wait until the rain will calm down." +
                "\n \n Decision 2: You decided to stand even though you can't move your right foot well and grab something like" +
                " a stick so that you will know what is ahead of you in that dark forest.");

    }

    @Override
    public void onClick(View v) {
        TextView txtDisplay = findViewById(R.id.txtBg);
        TextView txtAnswer = findViewById(R.id.txtAns);
        Intent i = new Intent(MainActivity.this, phase2_side1.class);
        Intent G = new Intent(MainActivity.this, phase2_side2.class);

        if (v.getId() == R.id.btn1) {
            if (v.getId() == R.id.btn1) {
                startActivity(i);
            }

        }
        else if (v.getId() == R.id.btn2){
            if (v.getId() == R.id.btn2) {
                startActivity(G);
            }

        }
    }
}

