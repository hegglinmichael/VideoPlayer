package com.example.michael.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

//must add a permission to the manifest
//tells the app hey I want to access the internet

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this creates a videoview object that goes with the xml
        final VideoView MYVIDEOVIEW = (VideoView) findViewById(R.id.videoView);
        //sets the video path to the url (URL goes in paranthasis)
        MYVIDEOVIEW.setVideoPath("https://www.youtube.com/watch?v=oF9yZenJtjI&index=55&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl");

        //player controls like play, pause, stop, etc.
        MediaController mediaController = new MediaController(this);
        //anchors the view to the media controller
        mediaController.setAnchorView(MYVIDEOVIEW);
        //sets the mediaController to the controller made earlier
        MYVIDEOVIEW.setMediaController(mediaController);

        //this starts the video
        MYVIDEOVIEW.start();
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
}
