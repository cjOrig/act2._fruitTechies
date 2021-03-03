package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loseScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_screen);

        TextView txtDisplay = findViewById(R.id.txtDs);

        txtDisplay.setText("GAME OVER \n \n" +
                "YOU MADE THE WRONG DECISION");


    }




    @Override
    public void onClick(View v) {

    }
}