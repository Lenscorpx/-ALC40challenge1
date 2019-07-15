package com.conebase.alc40challenge1;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    private static Button aboutAndela;
    private static Button myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        aboutAndela = (Button) findViewById(R.id.btnaboutAndela);
        aboutAndela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnAboutClicked();
            }
        });

        myprofile = (Button)findViewById(R.id.btnmyprofile);
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnProfileClicked();
            }
        });
    }

    private void OnAboutClicked()
    {
        Intent intent = new Intent("android.intent.action.AndelaWebview");
        startActivity(intent);
    }
    private void OnProfileClicked()
    {
        Intent intent = new Intent ("android:name=android.intent.action.MyProfile");
        startActivity(intent);
    }
}
