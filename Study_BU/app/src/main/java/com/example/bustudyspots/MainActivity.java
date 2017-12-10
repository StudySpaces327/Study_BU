package com.example.bustudyspots;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//just the first screen you see, with a nice enthusastic button.
//opens the Settings Activity

public class MainActivity extends AppCompatActivity {

    private Button open_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open_setting = findViewById(R.id.opensetting);
        open_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingActivity();
            }
        });

    }

    public void openSettingActivity() {
        Intent intent1 = new Intent(this, SettingActivity.class);
        startActivity(intent1);
    }
}


