package com.example.bhushan.mynanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);

        Button spotifyButton = (Button)findViewById(R.id.buttonSpotify);
        spotifyButton.setOnClickListener(btnListener);

        Button scoresButton = (Button)findViewById(R.id.buttonScores);
        scoresButton.setOnClickListener(btnListener);

        Button libraryButton = (Button)findViewById(R.id.buttonLibrary);
        libraryButton.setOnClickListener(btnListener);

        Button buildItButton = (Button)findViewById(R.id.buttonBuildIt);
        buildItButton.setOnClickListener(btnListener);

        Button xyzButton = (Button)findViewById(R.id.buttonXYZ);
        xyzButton.setOnClickListener(btnListener);

        Button capstoneButton = (Button)findViewById(R.id.buttonCapStone);
        capstoneButton.setOnClickListener(btnListener);

        return true;
    }

    //---create an anonymous class to act as a button click listener---
    private View.OnClickListener btnListener = new View.OnClickListener()
    {

        public void onClick(View v)
        {
            Button button = (Button)v;
            Toast.makeText(getApplicationContext(), "This Button will Launch "+button.getText()+" app", Toast.LENGTH_SHORT).show();
        }

    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
