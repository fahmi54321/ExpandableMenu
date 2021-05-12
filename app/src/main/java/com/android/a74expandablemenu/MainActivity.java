package com.android.a74expandablemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import me.anshulagarwal.expandablemenuoption.ExpandableMenuView;

public class MainActivity extends AppCompatActivity {

    ExpandableMenuView expandableMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableMenuView = (ExpandableMenuView) findViewById(R.id.expandable_menu);
        expandableMenuView.setOnMenuListener(new ExpandableMenuView.MenuListener() {
            @Override
            public void rightPressed() {
                Toast.makeText(MainActivity.this, "Right Pressed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void leftPressed() {
                Toast.makeText(MainActivity.this, "Left Pressed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void topPressed() {
                Toast.makeText(MainActivity.this, "Top Pressed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void bottomPressed() {
                Toast.makeText(MainActivity.this, "Bottom Pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}