package dost.itu.stii.starbooks_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private ProgressBar progressBar;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
//        videoView.setMediaController(mediaController);
//        videoView.setVideoPath("http://192.168.0.102/starbooks/fullvideo/flv/Vid_Y003.flv");
//
//        videoView.setOnPreparedListener(new io.vov.vitamio.MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(io.vov.vitamio.MediaPlayer mp) {
//                progressBar.setVisibility(View.GONE);
//                mp.setPlaybackSpeed(1.0f);
//            }
//        });
        videoView = findViewById(R.id.videoView);
        progressBar = findViewById(R.id.progBar);

    }
}
