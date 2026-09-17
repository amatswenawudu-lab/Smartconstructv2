package com.smartconstruct.game;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.Gravity;
import android.graphics.Color;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#FFC107"));
        TextView t = new TextView(this);
        t.setText("SmartConstruct\nConstruction Simulator\n\nCars, Tractors & Houses\n\nBUILD READY!");
        t.setTextSize(22);
        t.setGravity(Gravity.CENTER);
        t.setPadding(40,40,40,40);
        Button btn = new Button(this);
        btn.setText("START BUILDING");
        btn.setOnClickListener(v -> Toast.makeText(this, "Game Started!", Toast.LENGTH_LONG).show());
        layout.addView(t);
        layout.addView(btn);
        setContentView(layout);
    }
}
