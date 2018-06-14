package dost.itu.stii.starbooks_app.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import dost.itu.stii.starbooks_app.R;

/**
 * Created by ITU-PC on 14/06/2018.
 */

public class DostSplash extends AppCompatActivity{

    ImageView dost_logo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_dost);

        dost_logo = findViewById(R.id.imageDost);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Animation dostanim = AnimationUtils.loadAnimation(this,R.anim.splashtransition);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(DostSplash.this,StarbooksSplash.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_id, R.anim.fade_out);
                finish();
            }
        }, 1500);
    }
}
