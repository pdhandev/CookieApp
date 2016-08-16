package com.example.android.cookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view){

        // Reference to the ImageView in the layout. Change the image.

        ImageView cookieImageView = (ImageView) findViewById(R.id.cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);


        // Reference to the TextView in the layout. Change the text.
        TextView statusTextView = (TextView) findViewById(R.id.status_text_view);
        statusTextView.setText("I'm so Full !");
    }
}