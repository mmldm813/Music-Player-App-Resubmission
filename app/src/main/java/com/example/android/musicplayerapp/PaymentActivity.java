package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ImageButton backLibrary = (ImageButton) findViewById(R.id.back_to_library_button);
        backLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToLibraryIntent = new Intent(PaymentActivity.this, Library.class);
                startActivity(goToLibraryIntent);
                finish();
            }
        });

        ImageButton backStore = (ImageButton) findViewById(R.id.back_to_store_button);
        backStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }




}
