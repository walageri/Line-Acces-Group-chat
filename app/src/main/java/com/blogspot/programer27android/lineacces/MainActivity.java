package com.blogspot.programer27android.lineacces;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.bttn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLine();
            }
        });
    }
    public void openLine() {
        Uri uri = Uri.parse("http://line.me/R/ti/g/QwDM9rAw74");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
        likeIng.setPackage("jp.never.line.android");
        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://line.me/R/ti/g/QwDM9rAw74")));
        }
    }
}
