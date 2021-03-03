package mcm.edu.ph.act2_fruittechies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class winScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);

        TextView txtDisplay = findViewById(R.id.winDs);

        txtDisplay.setText("YOU MANAGE TO SURVIVE AND FINISH THE STORY\n \n" +
                "CONGRATULATIONS");




    }
}