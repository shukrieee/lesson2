package com.shukri.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout myScreenLayout = new LinearLayout(this);


        TextView Text1 = new TextView(this);
        Text1.setText("title");
        Text1.setGravity(Gravity.CENTER);
        Text1.setTextSize(20);
        Text1.setTextColor(Color.BLUE);
        Text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30.0f / getResources().getDisplayMetrics().density);
        myScreenLayout.addView(Text1);
        TextView Text2 = new TextView(this);
        Text2.setText("Body");
        Text2.setTextSize(20);
        Text2.setTextColor(Color.CYAN);
        Text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30.0f / getResources().getDisplayMetrics().density);
        myScreenLayout.addView(Text2);
        TextView Text3 = new TextView(this);
        Text3.setText("footer");
        Text3.setTextSize(20);
        Text3.setTextColor(Color.RED);
        Text3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30.0f / getResources().getDisplayMetrics().density);
        myScreenLayout.addView(Text3);



        setContentView(myScreenLayout);

    }
}
