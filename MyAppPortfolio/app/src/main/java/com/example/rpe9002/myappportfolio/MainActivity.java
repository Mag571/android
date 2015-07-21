package com.example.rpe9002.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

    // ---------  Button Click for Spotify Streamer ---------------
      public void spotify_streamer_onclick (View view) {

        View v = findViewById(R.id.but_Spotify_Streamer);
        toast_message(getResources().getString(R.string.spotify_output), v);
    }

    // ---------  Button Click for Scores App ---------------
    public void scores_app_onclick (View view) {
        View v = findViewById(R.id.but_Scores_App);
        toast_message(getResources().getString(R.string.scores_output),v);
    }

    // ---------  Button Click for Library App ---------------
    public void library_app_onclick (View view) {
        View v = findViewById(R.id.but_Library_App);
        toast_message(getResources().getString(R.string.library_output),v);

    }

    // ---------  Button Click for Built it Bigger ---------------
    public void built_it_bigger_onclick (View view) {
        View v = findViewById(R.id.but_Build_It_Bigger);
        toast_message(getResources().getString(R.string.bigger_output),v);
    }

    // ---------  Button Click for XYZ Reader ---------------
    public void xyz_reader_onclick (View view) {
        View v = findViewById(R.id.but_XYZ_Reader);
        toast_message(getResources().getString(R.string.xyz_output),v);
    }


    // ---------  Button Click for Capstone ---------------
    public void capstone_onclick (View view) {
        View v = findViewById(R.id.but_Capstone);
        toast_message(getResources().getString(R.string.capstone_output),v);
    }

    // ---------  Display Message for each button click  ---------------
    // -  Each Button Message sent to toast_message for display
    // -  Position toast under pressed button
        public void toast_message (String message, View v) {

            int location[]=new int[2];
            v.getLocationOnScreen(location);
            Toast toast=Toast.makeText(getApplicationContext(),
                    message, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, location[1]-15);
            toast.show();


    }

}
