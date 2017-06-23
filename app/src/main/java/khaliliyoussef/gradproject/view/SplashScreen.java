package khaliliyoussef.gradproject.view;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import khaliliyoussef.gradproject.R;

public class SplashScreen extends AppCompatActivity {

    private static int Splash_Time_Out=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_spalsh_screen);

        ImageView light_bulb = (ImageView)findViewById(R.id.light_bulb);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        light_bulb.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation)
            {

                Snackbar.make(findViewById(R.id.splash_layout),"Welcome To TarGmly",Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation)
            {
                finish();
                    Intent Go= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Go);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}






















