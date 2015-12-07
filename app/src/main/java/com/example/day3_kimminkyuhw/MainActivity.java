package com.example.day3_kimminkyuhw;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView01;
    ImageView imageView01;
    ImageView imageView02;
    BitmapDrawable bitmap01;
    BitmapDrawable bitmap02;
    BitmapDrawable bitmaptemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView01 = (ImageView) findViewById(R.id.imageView01);
        imageView02 = (ImageView) findViewById(R.id.imageView02);
        Button button01 = (Button) findViewById(R.id.button);

        ///scrollView01.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap01 = (BitmapDrawable) res.getDrawable(R.drawable.up);
        bitmap02 = (BitmapDrawable) res.getDrawable(R.drawable.down);

        imageView01.setImageDrawable(bitmap01);
        imageView02.setImageDrawable(bitmap02);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitmaptemp = bitmap01;
                bitmap01 = bitmap02;
                bitmap02 = bitmaptemp;

                imageView01.setImageDrawable(bitmap01);
                imageView02.setImageDrawable(bitmap02);

            }
        });
    }
}
