package com.examplepackage.parkingappac;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button play=(Button)findViewById(R.id.playBtn);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView videoView = (VideoView)findViewById(R.id.videoView);
                String urlPath = "android.resource://" + getPackageName() + "/" + R.raw.findingaparkingspace;
                videoView.setVideoURI(Uri.parse(urlPath));
                videoView.start();
            }
        });

        Button stop=(Button)findViewById(R.id.stopBtn);
        assert stop != null;
        stop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            VideoView videoView = (VideoView)findViewById(R.id.videoView);
            String urlPath = "android.resource://" + getPackageName() + "/" + R.raw.findingaparkingspace;
            videoView.setVideoURI(Uri.parse(urlPath));
            videoView.stopPlayback();

            Intent returnMain = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(returnMain);
        }
    });
    }
}

