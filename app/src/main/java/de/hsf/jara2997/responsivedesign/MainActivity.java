package de.hsf.jara2997.responsivedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Erklärung";
    private TextView Timer;
    private EditText Eingabefeld;
    private Button StartStopp;
    private ProgressBar Fortschrittsanzeige;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Entered the onCreate method");

        Timer = (TextView) findViewById(R.id.timer);
        Eingabefeld = (EditText) findViewById(R.id.eingabefeld);
        StartStopp = (Button) findViewById(R.id.startStopp);
        Fortschrittsanzeige = (ProgressBar) findViewById(R.id.fortschrittsanzeige);

        Timer.setText("00s");

        StartStopp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Button Click");

                Timer.setText(Eingabefeld.getText().toString()+"s");
                StartStopp.setText("STOP");
                Fortschrittsanzeige.setProgress(55, true);
            }
        });
   }

}






