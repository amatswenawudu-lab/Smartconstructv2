package com.smartconstruct.game;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("SMART CONSTRUCT\n\nGame Loading...\n\nYour APK built successfully!");
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(24);
        setContentView(tv);
    }
}
