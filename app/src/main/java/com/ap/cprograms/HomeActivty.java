package com.ap.cprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.InterstitialAd;

public class HomeActivty extends AppCompatActivity {

    TextView ivLogo, ivSubtitle, ivBtn;
    ImageView ivSplash;
    Animation smalltobig, fleft, fhelper;

    private InterstitialAd interstitialAd;

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activty);


//        To get Screen width and height
//        in my case Width: 720 Height: 1344 Redmi 5
        final int screen_width = getWindowManager().getDefaultDisplay().getWidth();
        final int screen_height = getWindowManager().getDefaultDisplay().getHeight();
        Log.i(TAG, "onCreate: Width: "+screen_width+" Height: "+screen_height);


        /*Display display = getWindowManager().getDefaultDisplay();
        int width =  display.getWidth();
        int height =  display.getHeight();*/

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        fleft = AnimationUtils.loadAnimation(this, R.anim.fromleftoright);

        Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");
        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
//        Typeface mregular = Typeface.createFromAsset(getAssets(), "fonts/MontserratRegular.ttf");

        ivLogo = findViewById(R.id.ivlogo);
        ivSubtitle = findViewById(R.id.ivsubtitle);
        ivBtn = findViewById(R.id.ivbtn);
        ivSplash = findViewById(R.id.ivSplash);

//        ivLogo.setTypeface(logox);
        ivSubtitle.setTypeface(mlight);
        ivBtn.setTypeface(mmedium);

        ivSplash.startAnimation(smalltobig);


        Log.i(TAG, "onCreate: "+ivSplash.getScaleType());

        ivLogo.setTranslationX(400);
        ivSubtitle.setTranslationX(400);
        ivBtn.setTranslationX(400);

        ivLogo.setAlpha(0);
        ivSubtitle.setAlpha(0);
        ivBtn.setAlpha(0);

        ivLogo.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        ivSubtitle.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        ivBtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();

        ivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivty.this, "Butto was clicked", Toast.LENGTH_SHORT).show();

//                ivLogo.setTranslationX(0);
//                ivLogo.animate().alpha(0).setDuration(1500).start();
//                ivSubtitle.animate().alpha(0).setDuration(1500).setStartDelay(200).start();
//                ivLetsGo.animate().alpha(1).setDuration(500).setStartDelay(1700).cancel();

//                ivLogo.animate().translationX(400).setDuration(5000).setStartDelay(1000).start();
//                ivLogo.setTranslationX(100);
//                ivLogo.animate().translationX(100).setDuration(5000).setStartDelay(3000).start();
                Intent intent = new Intent(HomeActivty.this, MainActivity.class);
                startActivity(intent);
                finish();

                /*boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                        .getBoolean("isFirstRun", true);

                if (isFirstRun) {
                    //show start activity

                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    Toast.makeText(MainActivity.this, "First Run", Toast.LENGTH_LONG)
                            .show();
                }

                getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                        .putBoolean("isFirstRun", false).apply();*/
            }
        });
    }








    private static long back_pressed_time;
    private static long PERIOD = 2000;

    @Override
    public void onBackPressed() {
        if (back_pressed_time + PERIOD > System.currentTimeMillis()) super.onBackPressed();
        else Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
        back_pressed_time = System.currentTimeMillis();
    }
}
