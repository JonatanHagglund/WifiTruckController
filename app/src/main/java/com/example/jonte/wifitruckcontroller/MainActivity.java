package com.example.jonte.wifitruckcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String appNameStr;
    private TextView mainTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appNameStr = getString(R.string.app_name);
        mainTextView = (TextView)findViewById(R.id.mainTextView);
        mainTextView.setText(mainTextView.getText() + "\n" + appNameStr);
    }


}
