package com.berkantyurtseven.warningscreenonapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this , "You can click it :)" , Toast.LENGTH_LONG).show();
    }
    public void click(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("You Clicked");
        alert.setMessage("Are you sure about it");
        alert.setPositiveButton("Yeah!!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You Clicked İt..", Toast.LENGTH_LONG).show();


            }
        });
        alert.setNegativeButton("Nooo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Why you did not click it ?", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();

    }
}