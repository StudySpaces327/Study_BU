package com.example.bustudyspots;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SettingActivity extends AppCompatActivity {

    public CheckBox cafe;
    public CheckBox libraries;
    public CheckBox BUonly;
    public CheckBox allPlaces;
    private Button save_changes_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        // Find the save changes button and set it to do some action when clicked
        save_changes_button = findViewById(R.id.savechangesbutton);
        save_changes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapActivity();
            }
        });

        //Set up the check boxes
        cafe = findViewById(R.id.cafeCheckBox);
        libraries = findViewById(R.id.libraryCheckBox);
        BUonly = findViewById(R.id.BUonlyCheckBox);
        allPlaces = findViewById(R.id.allPlacesCheckBox);

        //implement backspace function
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /* This button will carry out this function once clicked
        The function uses the check boxes to filter out the options that users want for study places
        */
    public void openMapActivity() {

        Intent openMap = new Intent(this, MapActivity.class);
        if(allPlaces.isChecked() == false && cafe.isChecked() == false && BUonly.isChecked() == false && libraries.isChecked() == false ){
            openMap.putExtra("All",true);  // if no check box is checked, all markers show up
        }
        else {
            openMap.putExtra("All", allPlaces.isChecked());
        }
        openMap.putExtra("Cafe", cafe.isChecked());
        openMap.putExtra("BUonly", BUonly.isChecked());
        openMap.putExtra("libraries", libraries.isChecked());
        startActivity(openMap);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    
    //These methods are just for shorthand

    public boolean cafeisChecked() {
        return cafe.isChecked();
    }

    public boolean libraryisChecked() {
        return libraries.isChecked();
    }

    public boolean BUonlyisChecked() {
        return BUonly.isChecked();
    }

    public boolean allPlacesChecked() {
        return allPlaces.isChecked();
    }

}
