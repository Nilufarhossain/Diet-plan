package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dietplan.R;
import com.example.dietplan.gain;
import com.example.dietplan.lose;
import com.example.dietplan.maintain;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button loseweight,maintainweight,gainweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loseweight =(Button)findViewById(R.id.loseButton);
        maintainweight =(Button)findViewById(R.id.maintainButoon);
        gainweight =(Button)findViewById(R.id.gainButoon);
        loseweight.setOnClickListener(this);
        maintainweight.setOnClickListener(this);
        gainweight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent ;
        if(v.getId()==R.id.loseButton)
        {
            intent = new Intent(MainActivity.this, lose.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.maintainButoon)
        {
            intent = new Intent(MainActivity.this, maintain.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.gainButoon)
        {
            intent = new Intent(MainActivity.this, gain.class);
            startActivity(intent);
        }
    }
}