package com.example.dscintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button owen;
    TextView gatare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        owen = (Button)findViewById(R.id.button);

        owen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patel = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(patel);
            }
        });

        owen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"button pressed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
