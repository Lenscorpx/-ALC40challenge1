package com.conebase.alc40challenge1;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    private static Button aboutAndela;
    private static Button myprofilex;
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

        myprofilex = (Button)findViewById(R.id.btnmyprofile);
        myprofilex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    private void OnAboutClicked()
    {
        Intent intent = new Intent(this,AndelaWebview.class);
        startActivity(intent);
    }
    private void openActivity()
    {
        Intent intent = new Intent (this,ProfileUI.class);
        startActivity(intent);
    }
}
