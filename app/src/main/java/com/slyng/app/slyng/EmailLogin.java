package com.slyng.app.slyng;

import com.slyng.app.slyng.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class EmailLogin extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_email_login);


        TextView tv;
        CharSequence cs;
        cs = getText(R.string.bestexpface);
        tv = (TextView)findViewById(R.id.bestexpface);
        tv.setText(cs);
        cs = getText(R.string.arrow);
        tv = (TextView)findViewById(R.id.arrowtv);
        tv.setText(cs);


    }


}
